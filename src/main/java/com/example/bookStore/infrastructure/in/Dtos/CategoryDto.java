package com.example.bookStore.infrastructure.in.Dtos;

import lombok.Builder;
import lombok.Data;

@Builder(toBuilder = true)
@Data
public class CategoryDto {

    private String name;
}
