package com.example.bookStore.domain.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class CategoryModel {

    private Long id;
    private String name;
}
