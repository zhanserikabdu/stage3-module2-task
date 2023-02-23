package com.mjc.school.service.factory;

import com.mjc.school.repository.entity.AuthorModel;
import com.mjc.school.repository.implementation.AuthorRepository;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.AuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements BaseService<AuthorDto, AuthorModel, Long> {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorModel> readAll() {
        return authorRepository.readAll();
    }

    @Override
    public AuthorModel readById(Long id) {
        return null;
    }

    @Override
    public AuthorModel create(AuthorDto createRequest) {
        return null;
    }

    @Override
    public AuthorModel update(AuthorDto updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
