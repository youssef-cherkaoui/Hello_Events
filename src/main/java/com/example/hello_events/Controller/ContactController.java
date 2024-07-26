package com.example.hello_events.Controller;


import com.example.hello_events.Model.Contact;
import com.example.hello_events.Model.Dto.ContactDTO;
import com.example.hello_events.Service.ContactService;
import com.example.hello_events.Service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactServiceImpl contactService;

    @PostMapping("/create")
    public Contact createContact(@RequestBody ContactDTO contact){
        return contactService.createContact(contact);
    }

    @GetMapping("/AllContacts")
    public List<Contact> getAllContacts(){
        return contactService.getAllContacts();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
    }

}
