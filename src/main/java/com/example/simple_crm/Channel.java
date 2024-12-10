package com.example.simple_crm;


/*---------------------------Assignment 3.11------------------ */
public class Channel {
    private String type;
    private String config;

    public Channel(String type, String config) {
        this.type = type;
        this.config = config;
    }

    public void send(String recipient, String message) {
        System.out.println("Sending" + type + " to" + recipient + ": " + message);
    }
}
