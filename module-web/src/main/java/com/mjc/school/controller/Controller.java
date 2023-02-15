package com.mjc.school.controller;

import java.util.List;

public interface Controller<T> {
    T create(T t);
    T update(T t);
    T readById(Long id);
    List<T> readAll();
    Boolean delete(Long id);
}

