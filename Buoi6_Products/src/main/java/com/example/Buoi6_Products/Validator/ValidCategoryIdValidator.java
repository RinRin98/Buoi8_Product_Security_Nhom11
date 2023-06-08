package com.example.Buoi6_Products.Validator;

import com.example.Buoi6_Products.Validator.annotation.ValidCategoryId;
import com.example.Buoi6_Products.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }
}
