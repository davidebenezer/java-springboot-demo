package com.example.demo.contoller;

import com.example.demo.entity.BookingEntity;
import com.example.demo.model.Booking;
import com.example.demo.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class BookingController {
    @Autowired
    BookingService bookingService;
    @PostMapping("bookings")
    public Booking createBooking(@RequestBody Booking booking){
        booking.setId(null);
        return bookingService.saveBooking(booking);
    }

    @GetMapping(value="bookings", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Booking> getAllBooking(){
        return bookingService.getAllBookings();
    }

    @PutMapping("bookings/{bookingId}")
    public Booking updateBooking(@PathVariable("bookingId") long id, @RequestBody Booking booking){
        booking.setId(id);
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping("/bookings/{bookingId}")
    public void deleteBooking(@PathVariable("bookingId") long id){
        bookingService.deleteBooking(id);
    }

}
