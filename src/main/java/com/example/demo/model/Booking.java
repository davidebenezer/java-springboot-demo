package com.example.demo.model;

import io.swagger.annotations.ApiModelProperty;

public class Booking {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @ApiModelProperty(hidden = true)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
