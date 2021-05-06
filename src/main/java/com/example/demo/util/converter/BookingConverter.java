package com.example.demo.util.converter;

import com.example.demo.entity.BookingEntity;
import com.example.demo.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingConverter {
    public static Booking convertBookingEntityToModel(BookingEntity bookingEntity){
         Booking booking = new Booking();
         booking.setId(bookingEntity.getId());
         booking.setName(bookingEntity.getName());
         return booking;
    }

    public static BookingEntity convertBookingModelToEntity(Booking booking){
        BookingEntity  bookingEntity = new BookingEntity();
        bookingEntity.setId(booking.getId());
        bookingEntity.setName(booking.getName());
        return bookingEntity;
    }

    public static List<Booking> convertBookingEntityListToModelList(List<BookingEntity> bookingEntityList){
        List<Booking> bookingList = new ArrayList<Booking>();
        for(BookingEntity bookingEntity:bookingEntityList){
            bookingList.add(convertBookingEntityToModel(bookingEntity));
        }
        return bookingList;
    }
}
