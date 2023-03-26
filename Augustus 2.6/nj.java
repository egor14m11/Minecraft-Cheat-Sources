import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.net.ServerSocket;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import net.minecraft.server.MinecraftServer;
import java.net.URL;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;
import com.google.common.util.concurrent.ListeningExecutorService;

// 
// Decompiled by Procyon v0.5.36
// 

public class nj
{
    public static final ListeningExecutorService a;
    private static final AtomicInteger b;
    private static final Logger c;
    
    public static String a(final Map<String, Object> \u2603) {
        final StringBuilder sb = new StringBuilder();
        for (final Map.Entry<String, Object> entry : \u2603.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            try {
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            }
            catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            if (entry.getValue() != null) {
                sb.append('=');
                try {
                    sb.append(URLEncoder.encode(entry.getValue().toString(), "UTF-8"));
                }
                catch (UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return sb.toString();
    }
    
    public static String a(final URL \u2603, final Map<String, Object> \u2603, final boolean \u2603) {
        return a(\u2603, a(\u2603), \u2603);
    }
    
    private static String a(final URL \u2603, final String \u2603, final boolean \u2603) {
        try {
            Proxy no_PROXY = (MinecraftServer.N() == null) ? null : MinecraftServer.N().ay();
            if (no_PROXY == null) {
                no_PROXY = Proxy.NO_PROXY;
            }
            final HttpURLConnection httpURLConnection = (HttpURLConnection)\u2603.openConnection(no_PROXY);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Length", "" + \u2603.getBytes().length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            final DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(\u2603);
            dataOutputStream.flush();
            dataOutputStream.close();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            final StringBuffer sb = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                sb.append('\r');
            }
            bufferedReader.close();
            return sb.toString();
        }
        catch (Exception throwable) {
            if (!\u2603) {
                nj.c.error("Could not post to " + \u2603, throwable);
            }
            return "";
        }
    }
    
    public static ListenableFuture<Object> a(final File \u2603, final String \u2603, final Map<String, String> \u2603, final int \u2603, final nu \u2603, final Proxy \u2603) {
        final ListenableFuture<?> submit = nj.a.submit((Runnable)new Runnable() {
            @Override
            public void run() {
                HttpURLConnection httpURLConnection = null;
                InputStream inputStream = null;
                OutputStream output = null;
                if (\u2603 != null) {
                    \u2603.b("Downloading Resource Pack");
                    \u2603.c("Making Request...");
                }
                try {
                    final byte[] array = new byte[4096];
                    final URL url = new URL(\u2603);
                    httpURLConnection = (HttpURLConnection)url.openConnection(\u2603);
                    float n = 0.0f;
                    float n2 = (float)\u2603.entrySet().size();
                    for (final Map.Entry<String, String> entry : \u2603.entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        if (\u2603 != null) {
                            \u2603.a((int)(++n / n2 * 100.0f));
                        }
                    }
                    inputStream = httpURLConnection.getInputStream();
                    n2 = (float)httpURLConnection.getContentLength();
                    final int contentLength = httpURLConnection.getContentLength();
                    if (\u2603 != null) {
                        \u2603.c(String.format("Downloading file (%.2f MB)...", n2 / 1000.0f / 1000.0f));
                    }
                    if (\u2603.exists()) {
                        final long length = \u2603.length();
                        if (length == contentLength) {
                            if (\u2603 != null) {
                                \u2603.a();
                            }
                            return;
                        }
                        nj.c.warn("Deleting " + \u2603 + " as it does not match what we currently have (" + contentLength + " vs our " + length + ").");
                        FileUtils.deleteQuietly(\u2603);
                    }
                    else if (\u2603.getParentFile() != null) {
                        \u2603.getParentFile().mkdirs();
                    }
                    output = new DataOutputStream(new FileOutputStream(\u2603));
                    if (\u2603 > 0 && n2 > \u2603) {
                        if (\u2603 != null) {
                            \u2603.a();
                        }
                        throw new IOException("Filesize is bigger than maximum allowed (file is " + n + ", limit is " + \u2603 + ")");
                    }
                    int read = 0;
                    while ((read = inputStream.read(array)) >= 0) {
                        n += read;
                        if (\u2603 != null) {
                            \u2603.a((int)(n / n2 * 100.0f));
                        }
                        if (\u2603 > 0 && n > \u2603) {
                            if (\u2603 != null) {
                                \u2603.a();
                            }
                            throw new IOException("Filesize was bigger than maximum allowed (got >= " + n + ", limit was " + \u2603 + ")");
                        }
                        if (Thread.interrupted()) {
                            nj.c.error("INTERRUPTED");
                            if (\u2603 != null) {
                                \u2603.a();
                            }
                            return;
                        }
                        output.write(array, 0, read);
                    }
                    if (\u2603 != null) {
                        \u2603.a();
                    }
                }
                catch (Throwable t) {
                    t.printStackTrace();
                    if (httpURLConnection != null) {
                        final InputStream errorStream = httpURLConnection.getErrorStream();
                        try {
                            nj.c.error(IOUtils.toString(errorStream));
                        }
                        catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    if (\u2603 != null) {
                        \u2603.a();
                    }
                }
                finally {
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly(output);
                }
            }
        });
        return (ListenableFuture<Object>)submit;
    }
    
    public static int a() throws IOException {
        ServerSocket serverSocket = null;
        int localPort = -1;
        try {
            serverSocket = new ServerSocket(0);
            localPort = serverSocket.getLocalPort();
        }
        finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }
            }
            catch (IOException ex) {}
        }
        return localPort;
    }
    
    public static String a(final URL \u2603) throws IOException {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)\u2603.openConnection();
        httpURLConnection.setRequestMethod("GET");
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        final StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
            sb.append('\r');
        }
        bufferedReader.close();
        return sb.toString();
    }
    
    static {
        a = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Downloader %d").build()));
        b = new AtomicInteger(0);
        c = LogManager.getLogger();
    }
}
