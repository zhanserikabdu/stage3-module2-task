package com.mjc.school.service.mapper;

import com.mjc.school.repository.model.impl.NewsEntity;
import com.mjc.school.service.dto.NewsDtoRequest;
import com.mjc.school.service.dto.NewsDtoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NewsMapper {

    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    NewsDtoResponse newsModelToDto(NewsEntity news);

    @Mappings(value = {
            @Mapping(target = "createDate", ignore = true),
            @Mapping(target = "lastUpdateDate", ignore = true)
    })
    NewsEntity newsDtoToModel(NewsDtoRequest news);

}