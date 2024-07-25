package com.example.hello_events.Repository;

import com.example.hello_events.Model.Dto.TicketDTO;
import com.example.hello_events.Model.Ticket;
import com.example.hello_events.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketRepository extends JpaRepository<TicketDTO, Long> {
}
