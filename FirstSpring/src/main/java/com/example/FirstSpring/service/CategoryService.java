package com.example.FirstSpring.service;

import com.example.FirstSpring.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);

    String deteleCategory(Long categoryId);

    Category updateCategory(Category category, Long categoryId);
}
