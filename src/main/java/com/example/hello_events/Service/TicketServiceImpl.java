package com.example.hello_events.Service;



import com.example.hello_events.Model.Ticket;
import com.example.hello_events.Model.Dto.TicketDTO;
import com.example.hello_events.Model.mapper.TicketMapper;
import com.example.hello_events.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    private TicketRepository TicketRepository;
    @Autowired
    private TicketMapper TicketMapper;

    @Override
    public TicketDTO createTicket(TicketDTO Ticket) {
        Ticket newTicket =  TicketMapper.toEntity(Ticket);
        return TicketMapper.toDTO( TicketRepository.save(newTicket));
    }

    @Override
    public List<TicketDTO> getAllTicket() {
        List<Ticket> Tickets = TicketRepository.findAll();
        return TicketMapper.toDTOList(Tickets);
    }

    @Override
    public void deleteTicket(Long id) {
        List<TicketDTO> Tickets = new ArrayList<>();
        Tickets.remove(id);
    }
}
