package com.example.hello_events.Repository;

import com.example.hello_events.Model.Dto.EventDTO;
import com.example.hello_events.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventDTO, Long> {
}
