package com.mjc.school.repository.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EntityConfig {
    @Bean
    public AuthorModel getAuthorModel(){
     return null;
    }
    @Bean
    public NewsModel getNewsModel(){
    return null;
    }
}
