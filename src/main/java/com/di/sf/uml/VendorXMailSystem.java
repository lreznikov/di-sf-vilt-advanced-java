package com.di.sf.uml;

public class VendorXMailSystem extends SmtpMailSystem {
    private int id;

    public VendorXMailSystem(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void sendMessage(Message message) {
        String log = getName() + SMTP_PROTOCOL_VER;
    }
}
