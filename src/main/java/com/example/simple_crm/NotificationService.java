package com.example.simple_crm;


/*---------------------------Assignment 3.11------------------ */
public class NotificationService {
    private Channel channel;

    public NotificationService(Channel channel) {
        this.channel = channel;
    }

    public void sendNotification(Message message) {
        channel.send(message.getRecipient(), message.getBody());
    }
}
