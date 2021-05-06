package com.example.demo.services;

import com.example.demo.entity.BookingEntity;
import com.example.demo.exception.GenericApplicationException;
import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import com.example.demo.util.converter.BookingConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;

    public Booking saveBooking(Booking booking) {
        return BookingConverter.convertBookingEntityToModel(bookingRepository.save(BookingConverter.convertBookingModelToEntity(booking)));
    }

    public List<Booking> getAllBookings() {
        return BookingConverter.convertBookingEntityListToModelList(bookingRepository.findAll());
    }

    public Booking updateBooking(Booking booking) {
        if(ObjectUtils.isEmpty(bookingRepository.findById(booking.getId()))){
            throw new GenericApplicationException("Unable to update Booking. Provided Id : "+booking.getId()+" does not exist");
        }
        return BookingConverter.convertBookingEntityToModel(bookingRepository.save(BookingConverter.convertBookingModelToEntity(booking)));
    }

    public void deleteBooking(long id) {
        bookingRepository.deleteById(id);
    }

}
