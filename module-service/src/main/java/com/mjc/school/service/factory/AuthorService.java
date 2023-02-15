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
    private final Repository<AuthorModel> AuthorRepository;
    private final AuthorValidation AuthorValidation;

    public AuthorService(){
        AuthorRepository = new AuthorRepository();
        AuthorValidation = new AuthorValidation();
    }

    @Override
    public AuthorDto  create(AuthorDto AuthorDto) {
        ErrorNotification errorNotification = AuthorValidation.validate(AuthorDto);
        if (errorNotification.hasErrors()){
            throw new InvalidDataException(errorNotification.getErrorList().toString());
        }
        AuthorModel AuthorModel = AuthorRepository.create(AuthorMapper.AuthorMapper.Author(AuthorDto));
        return AuthorMapper.AuthorMapper.AuthorDto(AuthorModel);
    }

    @Override
    public AuthorDto update(AuthorDto AuthorDto) {
        AuthorModel AuthorModel = AuthorRepository.readById(AuthorDto.getId());
        if (AuthorModel == null){
            throw new NoSuchEntityException("This entity does not exist");
        }

        ErrorNotification errorNotification = AuthorValidation.validate(AuthorDto);
        if (errorNotification.hasErrors()){
            throw new InvalidDataException(errorNotification.getErrorList().toString());
        }
        AuthorDto.setCreateDate(AuthorModel.getCreateDate());
        return AuthorMapper.AuthorMapper.AuthorDto(AuthorRepository.update(AuthorMapper.AuthorMapper.Author(AuthorDto)));
    }

    @Override
    public AuthorDto readById(Long id) {
        AuthorModel byId = AuthorRepository.readById(id);
        if (byId == null){
            throw new NoSuchEntityException("This entity does not exist");
        }
        return AuthorMapper.AuthorMapper.AuthorDto(byId);
    }

    @Override
    public List<AuthorDto> readAll() {
        return AuthorMapper.AuthorMapper.toListDto(AuthorRepository.readAll());
    }

    @Override
    public Boolean delete(Long id) {
        if (!AuthorRepository.delete(id)){
            throw new NoSuchEntityException("This entity does not exist");
        }
        return true;
    }
}


