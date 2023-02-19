package com.mjc.school.service;

import com.mjc.school.repository.entity.AuthorModel;
import com.mjc.school.service.dto.AuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuthorMapper {
    AuthorMapper authorMapper = Mappers.getMapper(AuthorMapper.class);
    AuthorDto authorDto(AuthorModel authorModel);
    AuthorModel author(AuthorDto authorDto);
    List<AuthorDto> toListDto (List<AuthorModel> authorModelModelList);
}


