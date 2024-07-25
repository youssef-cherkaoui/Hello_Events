package com.example.hello_events.Model.Dto;


import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EventDTO {

    private Long eventsId;
    private String title;
    private String description;
    private String location;
    private LocalDate date;
    private String category;
    private Double price;
    private int availableTickets;
    private List<BookingDTO> bookingDTOS;
    private List<TicketDTO> ticketDTOS;
}
