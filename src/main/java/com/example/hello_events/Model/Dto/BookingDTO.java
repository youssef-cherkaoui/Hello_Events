package com.example.hello_events.Model.Dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookingDTO {

    private Long bookingID;
    private LocalDateTime bookingDate;
    private int ticketsNumber;
    private UserDTO userDTO;
    private EventDTO eventDTO;
}
