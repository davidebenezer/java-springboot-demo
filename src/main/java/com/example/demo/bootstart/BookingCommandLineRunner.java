package com.example.demo.bootstart;

import com.example.demo.entity.BookingEntity;
import com.example.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookingCommandLineRunner implements CommandLineRunner {
    @Autowired
    BookingRepository bookingRepository;

    @Override
    public void run(String... args) {
        for(BookingEntity booking:bookingRepository.findAll()){
            System.out.println(booking.name);
        }
    }
}
