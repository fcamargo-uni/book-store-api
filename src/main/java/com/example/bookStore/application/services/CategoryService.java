package com.example.bookStore.application.services;

import com.example.bookStore.domain.ports.in.CategoryUseCase;
import com.example.bookStore.domain.ports.models.CategoryModel;
import com.example.bookStore.domain.ports.out.CategoryRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements CategoryUseCase {

    private final CategoryRepositoryPort categoryRepositoryPort;

    @Override
    public List<CategoryModel> findAll() {
        return categoryRepositoryPort.findAll();
    }
}
