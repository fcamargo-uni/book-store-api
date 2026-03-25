package com.example.bookStore.infrastructure.in;


import com.example.bookStore.domain.ports.in.CategoryUseCase;
import com.example.bookStore.domain.models.CategoryModel;
import com.example.bookStore.infrastructure.in.Dtos.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final CategoryUseCase categoryUseCase;

    @GetMapping("api/categories")
    public ResponseEntity<List<CategoryDto>> hello() {
        return ResponseEntity.ok(
                categoryUseCase.findAll()
                        .stream()
                        .map(this::toCategoryDto)
                        .toList());
    }

    private CategoryDto toCategoryDto(CategoryModel categoryModel) {
        return CategoryDto.builder()
                .name(categoryModel.getName())
                .build();
    }
}
