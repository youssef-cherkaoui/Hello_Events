package com.example.hello_events.Repository;

import com.example.hello_events.Model.Contact;
import com.example.hello_events.Model.Dto.ContactDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
