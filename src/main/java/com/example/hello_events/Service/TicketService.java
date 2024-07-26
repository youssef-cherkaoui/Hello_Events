package com.example.hello_events.Service;

import com.example.hello_events.Model.Dto.TicketDTO;

import java.util.List;

public interface TicketService {

    TicketDTO createTicket(TicketDTO Ticket);
    List<TicketDTO> getAllTicket();
    void deleteTicket(Long id);
}
