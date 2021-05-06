package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Booking")
public class BookingEntity {
    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", name ='" + name + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private Long id;

    public BookingEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public Long getId() {
        return id;
    }
}
