package com.example.hello_events.Service;

import com.example.hello_events.Model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event);
    List<Event> getAllEvents();
    Event editEvent(Event event, Long id);
    void deleteEvent(Long id);
}
