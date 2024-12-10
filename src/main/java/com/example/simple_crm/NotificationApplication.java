package com.example.simple_crm;


/*---------------------------Assignment 3.11------------------ */
public class NotificationApplication {
    public static void main(String[] args) {
        Channel emailChannel = new Channel("Email", "smtp.example.com");
        Message message = new Message("user@example.com", "Welcome", "Welcome to our service!");

        NotificationService notificationService = new NotificationService(emailChannel);
        notificationService.sendNotification(message);
    }
    
}
