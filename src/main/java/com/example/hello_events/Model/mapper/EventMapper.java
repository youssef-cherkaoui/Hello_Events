package com.example.hello_events.Model.mapper;

import com.example.hello_events.Model.Dto.EventDTO;
import com.example.hello_events.Model.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEntity(EventDTO DTO);
    EventDTO toDTO(Event entity);
    List<EventDTO> toDTOList(List<Event> users);
    List<Event> toEntityList(List<EventDTO> userDTOs);
}
