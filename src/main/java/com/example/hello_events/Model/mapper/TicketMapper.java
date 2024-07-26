package com.example.hello_events.Model.mapper;

import com.example.hello_events.Model.Dto.TicketDTO;
import com.example.hello_events.Model.Ticket;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TicketMapper {
    Ticket toEntity(TicketDTO DTO);
    TicketDTO toDTO(Ticket entity);
    List<TicketDTO> toDTOList(List<Ticket> transactions);
    List<Ticket> toEntityList(List<TicketDTO> userDTOs);
}

