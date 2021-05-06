package com.example.demo.repository;

import com.example.demo.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookingRepository extends JpaRepository<BookingEntity,Long> {
    abstract Collection<BookingEntity> findByName(String name);
}
