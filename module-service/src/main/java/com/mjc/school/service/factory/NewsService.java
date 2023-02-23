package com.mjc.school.service.factory;

import com.mjc.school.repository.entity.NewsModel;
import com.mjc.school.service.BaseService;
import com.mjc.school.service.dto.NewsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService implements BaseService<NewsDto, NewsModel, Long> {
    @Override
    public List<NewsModel> readAll() {
        return null;
    }

    @Override
    public NewsModel readById(Long id) {
        return null;
    }

    @Override
    public NewsModel create(NewsDto createRequest) {
        return null;
    }

    @Override
    public NewsModel update(NewsDto updateRequest) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}