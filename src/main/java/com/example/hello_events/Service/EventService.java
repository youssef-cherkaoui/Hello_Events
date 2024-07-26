package com.example.hello_events.Service;

import com.example.hello_events.Model.Dto.EventDTO;

import java.util.List;

public interface EventService {
    EventDTO createEvent(EventDTO event);
    List<EventDTO> getAllEvents();
    EventDTO editEvent(EventDTO event, Long id);
    void deleteEvent(Long id);
}
