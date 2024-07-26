package com.example.hello_events.Repository;

import com.example.hello_events.Model.Dto.EventDTO;
import com.example.hello_events.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
