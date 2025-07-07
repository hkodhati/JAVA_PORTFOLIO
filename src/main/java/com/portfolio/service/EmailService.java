package com.portfolio.service;

import com.portfolio.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    
    @Autowired
    private JavaMailSender mailSender;
    
    public void sendContactNotification(Contact contact) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("your-email@example.com"); // Replace with your email
        message.setSubject("New Contact Form Submission: " + contact.getSubject());
        message.setText(
            "Name: " + contact.getName() + "\n" +
            "Email: " + contact.getEmail() + "\n" +
            "Subject: " + contact.getSubject() + "\n" +
            "Message: " + contact.getMessage() + "\n" +
            "Date: " + contact.getCreatedAt()
        );
        
        mailSender.send(message);
    }
} 