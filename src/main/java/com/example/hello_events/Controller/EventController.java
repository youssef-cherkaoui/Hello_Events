
package com.example.hello_events.Controller;


import com.example.hello_events.Model.Dto.EventDTO;
import com.example.hello_events.Model.Event;
import com.example.hello_events.Service.EventService;
import com.example.hello_events.Service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")

public class EventController {
    
    @Autowired
    private EventServiceImpl eventService ;

    @PostMapping("/create")
    public EventDTO createEvent(@RequestBody EventDTO event){
        return eventService.createEvent(event);
    }

    @GetMapping("/AllEvents")
    public List<EventDTO> getAllEvents(){
        return eventService.getAllEvents();
    }

    @PutMapping
    public EventDTO updateEvent(@RequestBody EventDTO event, @PathVariable Long id){
        return  eventService.editEvent(event, id);
    }

    @DeleteMapping
    public void deleteEvent(@PathVariable Long id){
        eventService.deleteEvent(id);
    }
}
