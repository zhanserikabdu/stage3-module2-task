package com.mjc.school.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsDto {
    private Long id;
    private String title;
    private String content;
   private Long authorId;
    private LocalDateTime createDate;
    private LocalDateTime lastUpdateDate;

    public NewsDto(String title, String content,Long authorId) {
        this.title = title;
        this.content = content;
       this.authorId = authorId;
        this.createDate = LocalDateTime.now();
        this.lastUpdateDate = LocalDateTime.now();
    }

    public NewsDto(Long id, String title, String content,Long authorId) {
        this.id = id;
        this.title = title;
        this.content = content;
     this.authorId = authorId;
        this.createDate = LocalDateTime.now();
        this.lastUpdateDate = LocalDateTime.now();
    }
}

