package com.mjc.school.repository.entity;

import com.mjc.school.repository.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NewsModel implements BaseEntity<Long> {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;
    private Long authorId;

    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}

    //public NewsModel(String title, String content, Long authorId){
       // this.id = nextId.getAndIncrement();
       // this.title = title;
       // this.content = content;
        //this.createDate = LocalDateTime.now();
       // this.lastUpdateDate = LocalDateTime.now();
       // this.authorId = authorId;
   // }

