package com.mjc.school.service.dto;

import javax.validation.constraints.Size;
public class AuthorDto {
    private Long id;
    @Size(min = 3, max = 15)
    private String name;

    public AuthorDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //private Long id;
    //private String name;
    //private LocalDateTime createDate;
    //private LocalDateTime lastUpdateDate;

    //public AuthorDto(Long id, String name){
        //this.id = id;
        //this.name = name;
       // this.lastUpdateDate = LocalDateTime.now();
   // }

    //public AuthorDto(String name){
       // this.name = name;
        //this.createDate = LocalDateTime.now();
        //this.lastUpdateDate = LocalDateTime.now();
    //}

}

