package com.example.hello_events.Service;

import com.example.hello_events.Model.Dto.EventDTO;
import com.example.hello_events.Model.mapper.EventMapper;
import com.example.hello_events.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private EventMapper eventMapper;


    @Override
    public EventDTO createEvent(EventDTO event) {
        return eventMapper.toDTO(eventRepository.save(eventMapper.toEntity(event)));
    }

    @Override
    public List<EventDTO> getAllEvents() {
        return eventMapper.toDTOList(eventRepository.findAll());
    }

    @Override
    public EventDTO editEvent(EventDTO event, Long id) {
        eventRepository.findById(id);

        EventDTO editedEvent = new EventDTO();
        editedEvent.setEventsId(id);
        editedEvent.setDate(event.getDate());
        editedEvent.setCategory(event.getCategory());
        editedEvent.setBooking(event.getBooking());
        editedEvent.setDescription(event.getDescription());
        editedEvent.setPrice(event.getPrice());
        editedEvent.setLocation(event.getLocation());
        editedEvent.setAvailableTickets(event.getAvailableTickets());

        return eventMapper.toDTO(eventRepository.save(eventMapper.toEntity(editedEvent)))  ;
    }

    @Override
    public void deleteEvent(Long id){
        eventRepository.deleteById(id);
    }

}
