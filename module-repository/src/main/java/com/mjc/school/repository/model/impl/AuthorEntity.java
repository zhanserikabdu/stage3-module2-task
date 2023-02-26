package com.mjc.school.repository.model.impl;

import com.mjc.school.repository.model.BaseEntity;

import java.time.LocalDateTime;

public class AuthorEntity implements BaseEntity<Long> {
    private Long id;
    private String name;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;

    public AuthorEntity(Long id, String name) {
        this.name = name;
        this.createDate = LocalDateTime.now();
        this.lastUpdateDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}