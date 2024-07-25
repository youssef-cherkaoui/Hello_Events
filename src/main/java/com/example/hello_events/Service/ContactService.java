package com.example.hello_events.Service;

import com.example.hello_events.Model.Contact;

import java.util.List;

public interface ContactService {

    Contact createContact(Contact contact);
    List<Contact> getAllContacts();
    void deleteContact(Long id);
}
