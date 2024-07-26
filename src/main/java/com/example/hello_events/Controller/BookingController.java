package com.example.hello_events.Controller;


import com.example.hello_events.Model.Contact;
import com.example.hello_events.Model.Dto.BookingDTO;
import com.example.hello_events.Model.Dto.ContactDTO;
import com.example.hello_events.Service.BookingServiceImpl;
import com.example.hello_events.Service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Booking")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;

    @PostMapping("/create")
    public BookingDTO createContact(@RequestBody BookingDTO booking){
        return bookingService.createBooking(booking);
    }

    @GetMapping("/AllBooking")
    public List<BookingDTO> getAllContacts(){
        return bookingService.getAllBooking();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContact(@PathVariable Long id){
        bookingService.deleteBooking(id);
    }

}
