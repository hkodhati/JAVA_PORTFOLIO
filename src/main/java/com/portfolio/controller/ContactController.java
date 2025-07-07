package com.portfolio.controller;

import com.portfolio.model.Contact;
import com.portfolio.repository.ContactRepository;
import com.portfolio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactController {
    
    @Autowired
    private ContactRepository contactRepository;
    
    @Autowired
    private EmailService emailService;
    
    @PostMapping
    public ResponseEntity<?> submitContact(@Valid @RequestBody Contact contact, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body("Validation errors: " + result.getAllErrors());
        }
        
        Contact savedContact = contactRepository.save(contact);
        
        // Send email notification (optional)
        try {
            emailService.sendContactNotification(contact);
        } catch (Exception e) {
            // Log the error but don't fail the request
            System.err.println("Failed to send email notification: " + e.getMessage());
        }
        
        return ResponseEntity.ok(savedContact);
    }
    
    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAllByOrderByCreatedAtDesc();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        return contact.map(ResponseEntity::ok)
                     .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}/read")
    public ResponseEntity<Contact> markAsRead(@PathVariable Long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        if (contact.isPresent()) {
            Contact updatedContact = contact.get();
            updatedContact.setRead(true);
            return ResponseEntity.ok(contactRepository.save(updatedContact));
        }
        return ResponseEntity.notFound().build();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteContact(@PathVariable Long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        if (contact.isPresent()) {
            contactRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
} 