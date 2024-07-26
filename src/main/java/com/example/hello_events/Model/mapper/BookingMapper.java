package com.example.hello_events.Model.mapper;

import com.example.hello_events.Model.Booking;
import com.example.hello_events.Model.Dto.BookingDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    Booking toEntity(BookingDTO DTO);
    BookingDTO toDTO(Booking entity);
    List<BookingDTO> toDTOList(List<Booking> users);
    List<Booking> toEntityList(List<BookingDTO> userDTOs);
}

