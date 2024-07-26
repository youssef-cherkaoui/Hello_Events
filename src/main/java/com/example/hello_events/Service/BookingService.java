package com.example.hello_events.Service;

import com.example.hello_events.Model.Contact;
import com.example.hello_events.Model.Dto.BookingDTO;

import java.util.List;

public interface BookingService {

    BookingDTO createBooking(BookingDTO booking);
    List<BookingDTO> getAllBooking();
    void deleteBooking(Long id);
}
