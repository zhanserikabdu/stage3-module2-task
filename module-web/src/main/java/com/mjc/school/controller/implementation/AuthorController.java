package com.mjc.school.controller.implementation;

import com.mjc.school.controller.Controller;
import com.mjc.school.service.Service;
import com.mjc.school.service.dto.AuthorDto;

import java.util.List;

public class AuthorController implements Controller<AuthorDto> {
    private final Service<AuthorDto> authorService;
    public AuthorController(Service<AuthorDto> authorService) {
        this.authorService = authorService;
    }

    @Override
    public AuthorDto create(AuthorDto authorDto) {
        return authorService.create(authorDto);
    }

    @Override
    public AuthorDto update(AuthorDto authorDto) {
        return authorService.update(authorDto);
    }

    @Override
    public AuthorDto readById(Long id) {
        return authorService.readById(id);
    }

    @Override
    public List<AuthorDto> readAll() {
        return authorService.readAll();
    }

    @Override
    public Boolean delete(Long id) {
        return authorService.delete(id);
    }
}
