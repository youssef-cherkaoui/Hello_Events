package com.example.hello_events.Model.Dto;

import lombok.Data;

@Data
public class TicketDTO {

    private Long id;
    private UserDTO userDTO;
    private EventDTO eventDTO;
    private int quantity;
    private double price;

}
