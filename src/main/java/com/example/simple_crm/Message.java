package com.example.simple_crm;

/*---------------------------Assignment 3.11------------------ */
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
    private String recipient;
    private String subject;
    private String body;

    public Message(String recipient, String subject, String body) {
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
    }

    // Getters and setters
}
