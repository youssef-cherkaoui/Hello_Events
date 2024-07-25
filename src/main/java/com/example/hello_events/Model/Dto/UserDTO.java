package com.example.hello_events.Model.Dto;

import com.example.hello_events.Model.Enums.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private List<BookingDTO> bookingDTOS;
    private List<TicketDTO> ticketDTOS;
}
