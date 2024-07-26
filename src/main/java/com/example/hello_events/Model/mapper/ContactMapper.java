package com.example.hello_events.Model.mapper;

import com.example.hello_events.Model.Booking;
import com.example.hello_events.Model.Contact;
import com.example.hello_events.Model.Dto.BookingDTO;
import com.example.hello_events.Model.Dto.ContactDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    Contact toEntity(ContactDTO DTO);
    ContactDTO toDTO(Contact entity);
    List<ContactDTO> toDTOList(List<Contact> users);
    List<Contact> toEntityList(List<ContactDTO> userDTOs);
}

