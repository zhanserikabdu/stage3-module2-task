package com.mjc.school.repository.implementation;

import com.mjc.school.repository.BaseRepository;
import com.mjc.school.repository.entity.AuthorModel;

import java.util.List;
import java.util.Optional;

public class AuthorRepository implements BaseRepository<AuthorModel, Long> {
    @Override
    public List<AuthorModel> readAll() {
        return null;
    }

    @Override
    public Optional<AuthorModel> readById(Long id) {
        return Optional.empty();
    }

    @Override
    public AuthorModel create(AuthorModel entity) {
        return null;
    }

    @Override
    public AuthorModel update(AuthorModel entity) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean existById(Long id) {
        return false;
    }
}