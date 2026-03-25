package com.example.bookStore.domain.ports.out;

import com.example.bookStore.domain.ports.models.CategoryModel;

import java.util.List;

public interface CategoryRepositoryPort {

    List<CategoryModel> findAll();
}
