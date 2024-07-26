package com.example.hello_events.Controller;


import com.example.hello_events.Model.Dto.TicketDTO;
import com.example.hello_events.Service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Ticket")
public class TicketController {

    @Autowired
    private TicketServiceImpl TicketService;

    @PostMapping("/create")
    public TicketDTO createContact(@RequestBody TicketDTO Ticket){
        return TicketService.createTicket(Ticket);
    }

    @GetMapping("/AllTicket")
    public List<TicketDTO> getAllContacts(){
        return TicketService.getAllTicket();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContact(@PathVariable Long id){
        TicketService.deleteTicket(id);
    }

}
