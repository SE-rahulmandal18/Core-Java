package com.example.FirstSpring.repositories;

import com.example.FirstSpring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
