package com.example.hello_events.Model.Dto;


import lombok.Data;

@Data
public class ContactDTO {

    private Long contactId;
    private String name ;
    private String email ;
    private String subject ;
    private String message ; 
}
