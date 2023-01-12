package com.di.sf.uml;

public abstract class SmtpMailSystem implements EmailSystem {
    protected static final String SMTP_PROTOCOL_VER = "2.1";

    private String name;

    public String getName() {
        return "DEBUG_" + name + "_DEBUG";
    }

    @Override
    public abstract void sendMessage(Message message);
}
