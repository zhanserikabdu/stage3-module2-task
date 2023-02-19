package com.mjc.school.service.factory;

import com.mjc.school.repository.Repository;
import com.mjc.school.repository.entity.AuthorModel;
import com.mjc.school.repository.implementation.AuthorRepository;
import com.mjc.school.service.AuthorMapper;
import com.mjc.school.service.Service;
import com.mjc.school.service.dto.AuthorDto;
import com.mjc.school.service.exceptions.ErrorNotification;
import com.mjc.school.service.exceptions.InvalidDataException;
import com.mjc.school.service.exceptions.NoSuchEntityException;
import com.mjc.school.service.validator.AuthorValidation;

import java.util.List;

public class AuthorService implements Service<AuthorDto> {
    private final Repository<AuthorModel> authorRepository;
    private final AuthorValidation authorValidation;

    public AuthorService(){
        authorRepository = new AuthorRepository();
        authorValidation = new AuthorValidation();
    }

    @Override
    public AuthorDto create(AuthorDto authorDto) {
        ErrorNotification errorNotification = authorValidation.validate(authorDto);
        if (errorNotification.hasErrors()){
            throw new InvalidDataException(errorNotification.getErrorList().toString());
        }
        AuthorModel authorModel = authorRepository.create(AuthorMapper.authorMapper.author(authorDto));
        return AuthorMapper.authorMapper.authorDto(authorModel);
    }

    @Override
    public AuthorDto update(AuthorDto authorDto) {
        AuthorModel authorModel = authorRepository.readById(authorDto.getId());
        if (authorModel == null){
            throw new NoSuchEntityException("This entity does not exist");
        }

        ErrorNotification errorNotification = authorValidation.validate(authorDto);
        if (errorNotification.hasErrors()){
            throw new InvalidDataException(errorNotification.getErrorList().toString());
        }
        authorDto.setCreateDate(authorModel.getCreateDate());
        return AuthorMapper.authorMapper.authorDto(authorRepository.update(AuthorMapper.authorMapper.author(authorDto)));
    }

    @Override
    public AuthorDto readById(Long id) {
        AuthorModel byId = authorRepository.readById(id);
        if (byId == null){
            throw new NoSuchEntityException("This entity does not exist");
        }
        return AuthorMapper.authorMapper.authorDto(byId);
    }

    @Override
    public List<AuthorDto> readAll() {
        return AuthorMapper.authorMapper.toListDto(authorRepository.readAll());
    }

    @Override
    public Boolean delete(Long id) {
        if (!authorRepository.delete(id)){
            throw new NoSuchEntityException("This entity does not exist");
        }
        return true;
    }
}


