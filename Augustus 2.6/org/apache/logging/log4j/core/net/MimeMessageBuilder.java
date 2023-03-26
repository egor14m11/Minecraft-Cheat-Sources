// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.logging.log4j.core.net;

import javax.mail.internet.AddressException;
import java.nio.charset.StandardCharsets;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.Address;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import org.apache.logging.log4j.core.util.Builder;

public class MimeMessageBuilder implements Builder<MimeMessage>
{
    private final MimeMessage message;
    
    public MimeMessageBuilder(final Session session) {
        this.message = new MimeMessage(session);
    }
    
    public MimeMessageBuilder setFrom(final String from) throws MessagingException {
        final InternetAddress address = parseAddress(from);
        if (null != address) {
            this.message.setFrom((Address)address);
        }
        else {
            try {
                this.message.setFrom();
            }
            catch (Exception ex) {
                this.message.setFrom((Address)null);
            }
        }
        return this;
    }
    
    public MimeMessageBuilder setReplyTo(final String replyTo) throws MessagingException {
        final InternetAddress[] addresses = parseAddresses(replyTo);
        if (null != addresses) {
            this.message.setReplyTo((Address[])addresses);
        }
        return this;
    }
    
    public MimeMessageBuilder setRecipients(final Message.RecipientType recipientType, final String recipients) throws MessagingException {
        final InternetAddress[] addresses = parseAddresses(recipients);
        if (null != addresses) {
            this.message.setRecipients(recipientType, (Address[])addresses);
        }
        return this;
    }
    
    public MimeMessageBuilder setSubject(final String subject) throws MessagingException {
        if (subject != null) {
            this.message.setSubject(subject, StandardCharsets.UTF_8.name());
        }
        return this;
    }
    
    @Deprecated
    public MimeMessage getMimeMessage() {
        return this.build();
    }
    
    @Override
    public MimeMessage build() {
        return this.message;
    }
    
    private static InternetAddress parseAddress(final String address) throws AddressException {
        return (address == null) ? null : new InternetAddress(address);
    }
    
    private static InternetAddress[] parseAddresses(final String addresses) throws AddressException {
        return (InternetAddress[])((addresses == null) ? null : InternetAddress.parse(addresses, true));
    }
}
