// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.appender;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import org.apache.logging.log4j.core.net.ssl.LaxHostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.Layout;
import java.util.Objects;
import org.apache.logging.log4j.core.config.ConfigurationException;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.net.ssl.SslConfiguration;
import org.apache.logging.log4j.core.config.Property;
import java.net.URL;
import java.nio.charset.Charset;

public class HttpURLConnectionManager extends HttpManager
{
    private static final Charset CHARSET;
    private final URL url;
    private final boolean isHttps;
    private final String method;
    private final int connectTimeoutMillis;
    private final int readTimeoutMillis;
    private final Property[] headers;
    private final SslConfiguration sslConfiguration;
    private final boolean verifyHostname;
    
    public HttpURLConnectionManager(final Configuration configuration, final LoggerContext loggerContext, final String name, final URL url, final String method, final int connectTimeoutMillis, final int readTimeoutMillis, final Property[] headers, final SslConfiguration sslConfiguration, final boolean verifyHostname) {
        super(configuration, loggerContext, name);
        this.url = url;
        if (!url.getProtocol().equalsIgnoreCase("http") && !url.getProtocol().equalsIgnoreCase("https")) {
            throw new ConfigurationException("URL must have scheme http or https");
        }
        this.isHttps = this.url.getProtocol().equalsIgnoreCase("https");
        this.method = Objects.requireNonNull(method, "method");
        this.connectTimeoutMillis = connectTimeoutMillis;
        this.readTimeoutMillis = readTimeoutMillis;
        this.headers = ((headers != null) ? headers : Property.EMPTY_ARRAY);
        this.sslConfiguration = sslConfiguration;
        if (this.sslConfiguration != null && !this.isHttps) {
            throw new ConfigurationException("SSL configuration can only be specified with URL scheme https");
        }
        this.verifyHostname = verifyHostname;
    }
    
    @Override
    public void send(final Layout<?> layout, final LogEvent event) throws IOException {
        final HttpURLConnection urlConnection = (HttpURLConnection)this.url.openConnection();
        urlConnection.setAllowUserInteraction(false);
        urlConnection.setDoOutput(true);
        urlConnection.setDoInput(true);
        urlConnection.setRequestMethod(this.method);
        if (this.connectTimeoutMillis > 0) {
            urlConnection.setConnectTimeout(this.connectTimeoutMillis);
        }
        if (this.readTimeoutMillis > 0) {
            urlConnection.setReadTimeout(this.readTimeoutMillis);
        }
        if (layout.getContentType() != null) {
            urlConnection.setRequestProperty("Content-Type", layout.getContentType());
        }
        for (final Property header : this.headers) {
            urlConnection.setRequestProperty(header.getName(), header.isValueNeedsLookup() ? this.getConfiguration().getStrSubstitutor().replace(event, header.getValue()) : header.getValue());
        }
        if (this.sslConfiguration != null) {
            ((HttpsURLConnection)urlConnection).setSSLSocketFactory(this.sslConfiguration.getSslSocketFactory());
        }
        if (this.isHttps && !this.verifyHostname) {
            ((HttpsURLConnection)urlConnection).setHostnameVerifier(LaxHostnameVerifier.INSTANCE);
        }
        final byte[] msg = layout.toByteArray(event);
        urlConnection.setFixedLengthStreamingMode(msg.length);
        urlConnection.connect();
        try (final OutputStream os = urlConnection.getOutputStream()) {
            os.write(msg);
        }
        final byte[] buffer = new byte[1024];
        try (final InputStream is = urlConnection.getInputStream()) {
            while (-1 != is.read(buffer)) {}
        }
        catch (IOException e) {
            final StringBuilder errorMessage = new StringBuilder();
            try (final InputStream es = urlConnection.getErrorStream()) {
                errorMessage.append(urlConnection.getResponseCode());
                if (urlConnection.getResponseMessage() != null) {
                    errorMessage.append(' ').append(urlConnection.getResponseMessage());
                }
                if (es != null) {
                    errorMessage.append(" - ");
                    int n;
                    while (-1 != (n = es.read(buffer))) {
                        errorMessage.append(new String(buffer, 0, n, HttpURLConnectionManager.CHARSET));
                    }
                }
            }
            if (urlConnection.getResponseCode() > -1) {
                throw new IOException(errorMessage.toString());
            }
            throw e;
        }
    }
    
    static {
        CHARSET = Charset.forName("US-ASCII");
    }
}
