package com.example.FirstSpring.service;

import com.example.FirstSpring.model.Category;
import com.example.FirstSpring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
//    private List<Category> categories = new ArrayList<>();
    private Long nextId = 1L;
    @Autowired
    private CategoryRepository categoryRepository;

//    @Override
//    public List<Category> getAllCategories() {
//        return categories;
//    }
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }


    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
//        categories.add(category);
        categoryRepository.save(category);
    }

    @Override
    public String deteleCategory(Long categoryId) {

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

        categoryRepository.delete(category);
        return "Category with categoryId: " + categoryId + " deleted successfully";



//        List<Category> categories = categoryRepository.findAll();
//        Category category = categories.stream()
//                    .filter(c -> c.getCategoryId().equals(categoryId)).findFirst()
//                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
////            if(category == null)
////                return "Category not found!";
//
//       categoryRepository.delete(category);
//        return "Category with categoryId: " + categoryId + " deleted successfully";
//
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
     // with introduction of repositories

        Optional<Category> savedCategoryOptional = categoryRepository.findById(categoryId);

        Category savedCategory = savedCategoryOptional
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not Found!"));

        category.setCategoryId(categoryId);
        savedCategory = categoryRepository.save(category);
        return savedCategory;

        // without introduction of repositories
//        List<Category> categories = categoryRepository.findAll();
//        Optional<Category> optionalCategory = categories.stream()
//                .filter(c -> c.getCategoryId().equals(categoryId)).findFirst();
//
//       if(optionalCategory.isPresent()){
//           Category existingCategory = optionalCategory.get();
//           existingCategory.setCategoryName(category.getCategoryName());
//           Category savedCategory = categoryRepository.save(existingCategory);
//           return  savedCategory;
//       } else {
//           throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found");
//
//       }
    }
}
