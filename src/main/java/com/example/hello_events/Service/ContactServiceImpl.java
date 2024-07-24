package com.example.hello_events.Service;


import com.example.hello_events.Model.Contact;
import com.example.hello_events.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository ;

    @Override
    public Contact createContact(Contact contact){
        return  contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }


    @Override
    public void deleteContact(Long id){
        contactRepository.deleteById(id);
    }
}
