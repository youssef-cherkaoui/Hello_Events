package com.example.hello_events.Service;



import com.example.hello_events.Model.Booking;
import com.example.hello_events.Model.Dto.BookingDTO;
import com.example.hello_events.Model.mapper.BookingMapper;
import com.example.hello_events.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private BookingMapper bookingMapper;

    @Override
    public BookingDTO createBooking(BookingDTO booking) {
        Booking newbooking =  bookingMapper.toEntity(booking);
        return bookingMapper.toDTO( bookingRepository.save(newbooking));
    }

    @Override
    public List<BookingDTO> getAllBooking() {
        List<Booking> bookings = bookingRepository.findAll();
        return bookingMapper.toDTOList(bookings);
    }

    @Override
    public void deleteBooking(Long id) {
        List<BookingDTO> bookings = new ArrayList<>();
        bookings.remove(id);
    }
}
