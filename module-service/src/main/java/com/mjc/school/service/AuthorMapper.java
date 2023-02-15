package com.mjc.school.service;

import com.mjc.school.repository.entity.AuthorModel;
import com.mjc.school.service.dto.AuthorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AuthorMapper {
    AuthorMapper AuthorMapper = Mappers.getMapper(AuthorMapper.class);
    AuthorDto AuthorDto(AuthorModel AuthorModel);
    AuthorModel Author(AuthorDto AuthorDto);
    List<AuthorDto> toListDto (List<AuthorModel> AuthorModelModelList);
}