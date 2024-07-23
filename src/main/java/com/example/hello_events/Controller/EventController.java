
package com.example.hello_events.Controller;


import com.example.hello_events.Model.Event;
import com.example.hello_events.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")

public class EventController {
    
    @Autowired
    private EventService eventService ;

    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event){
        return eventService.createEvent(event);
    }

    @GetMapping("/AllEvents")
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @PutMapping
    public Event updateEvent(@RequestBody Event event, @PathVariable Long id){
        return  eventService.editEvent(event, id);
    }

    @DeleteMapping
    public void deleteEvent(@PathVariable Long id){
        eventService.deleteEvent(id);
    }
}
