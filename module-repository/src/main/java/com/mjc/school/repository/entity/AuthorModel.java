package com.mjc.school.repository.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
public class AuthorModel {
    private static AtomicLong nextID = new AtomicLong();
    private Long id;
    private String name;
    private LocalDateTime createDate;
    private  LocalDateTime lastUpdateDate;

    public AuthorModel (){
        this.id = nextID.getAndIncrement();
    }

    public AuthorModel(String name) {
        this.id = nextID.getAndIncrement();
        this.name = name;
    }
}
