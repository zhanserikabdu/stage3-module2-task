package com.mjc.school.service.implementation;

import com.mjc.school.repository.entity.AuthorModel;
import com.mjc.school.service.AuthorMapper;
import com.mjc.school.service.dto.AuthorDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorMapperImpl implements AuthorMapper {
    @Override
    public AuthorDto authorDto(AuthorModel authorModel) {
        if ( authorModel == null ) {
            return null;
        }

        AuthorDto authorDto = new AuthorDto();

        authorDto.setId( authorModel.getId() );
        authorDto.setName( authorModel.getName() );
        //newsDto.setContent( newsModel.getContent() );
        //newsDto.setAuthorId( newsModel.getAuthorId() );
        authorDto.setCreateDate( authorModel.getCreateDate() );
        authorDto.setLastUpdateDate( authorModel.getLastUpdateDate() );

        return authorDto;
    }

    @Override
    public AuthorModel author(AuthorDto authorDto) {
        if ( authorDto == null ) {
            return null;
        }

        AuthorModel authorModel = new AuthorModel();

        authorModel.setId( authorDto.getId() );
        authorModel.setName( authorDto.getName() );
        //newsModel.setContent( newsDto.getContent() );
        authorModel.setCreateDate( authorDto.getCreateDate() );
        authorModel.setLastUpdateDate( authorDto.getLastUpdateDate() );
        //authorModel.setAuthorId( authorDto.getAuthorId() );

        return authorModel;
    }

    @Override
    public List<AuthorDto> toListDto(List<AuthorModel> authorModelList) {
        if ( authorModelList == null ) {
            return null;
        }

        List<AuthorDto> list = new ArrayList<AuthorDto>( authorModelList.size() );
        for ( AuthorModel authorModel : authorModelList) {
            list.add( authorDto(authorModel) );
        }

        return list;
    }
}

