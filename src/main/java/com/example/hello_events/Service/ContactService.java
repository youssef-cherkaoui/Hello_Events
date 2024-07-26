package com.example.hello_events.Service;

import com.example.hello_events.Model.Contact;
import com.example.hello_events.Model.Dto.ContactDTO;

import java.util.List;

public interface ContactService {

    Contact createContact(ContactDTO contact);
    List<Contact> getAllContacts();
    void deleteContact(Long id);
}
