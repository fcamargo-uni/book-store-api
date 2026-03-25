package com.example.bookStore.domain.ports.in;

import com.example.bookStore.domain.ports.models.CategoryModel;
import java.util.List;

public interface CategoryUseCase {

    List<CategoryModel> findAll();

}
