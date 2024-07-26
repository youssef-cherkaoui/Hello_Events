package com.example.hello_events.Service;


import com.example.hello_events.Model.Contact;
import com.example.hello_events.Model.Dto.ContactDTO;
import com.example.hello_events.Model.mapper.ContactMapper;
import com.example.hello_events.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactRepository contactRepository ;
    @Autowired
    private ContactMapper contactMapper;

    @Override
    public Contact createContact(ContactDTO contact) {
        ContactDTO newcontact = contact;
        return contactRepository.save(contactMapper.toEntity(newcontact));
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = contactRepository.findAll();
        return contacts;
    }

    @Override
    public void deleteContact(Long id) {
    List<ContactDTO> contacts = new ArrayList<>();
    contacts.remove(id);
    }
}
