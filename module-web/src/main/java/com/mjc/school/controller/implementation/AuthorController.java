package com.mjc.school.controller.implementation;

import com.mjc.school.controller.Controller;
import com.mjc.school.service.Service;
import com.mjc.school.service.dto.AuthorDto;

import java.util.List;

public class AuthorController implements Controller<AuthorDto> {
    private final Service<AuthorDto> AuthorService;
    public AuthorController(Service<AuthorDto> AuthorService) {
        this.AuthorService = AuthorService;
    }

    @Override
    public AuthorDto create(AuthorDto AuthorDto) {
        return AuthorService.create(AuthorDto);
    }

    @Override
    public AuthorDto update(AuthorDto AuthorDto) {
        return AuthorService.update(AuthorDto);
    }

    @Override
    public AuthorDto readById(Long id) {
        return AuthorService.readById(id);
    }

    @Override
    public List<AuthorDto> readAll() {
        return AuthorService.readAll();
    }

    @Override
    public Boolean delete(Long id) {
        return AuthorService.delete(id);
    }
}
