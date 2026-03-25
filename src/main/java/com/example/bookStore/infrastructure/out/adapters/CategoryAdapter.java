package com.example.bookStore.infrastructure.out.adapters;

import com.example.bookStore.domain.ports.models.CategoryModel;
import com.example.bookStore.domain.ports.out.CategoryRepositoryPort;
import com.example.bookStore.infrastructure.out.entities.Category;
import com.example.bookStore.infrastructure.out.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryAdapter implements CategoryRepositoryPort {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryModel> findAll() {
        return categoryRepository.findAll()
                .stream()
                .map(this::toCategoryModel)
                .toList();
    }

    private CategoryModel toCategoryModel(Category category) {
        return CategoryModel.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
