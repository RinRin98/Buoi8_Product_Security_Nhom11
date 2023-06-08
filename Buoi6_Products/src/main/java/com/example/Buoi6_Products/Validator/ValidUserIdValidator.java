package com.example.Buoi6_Products.Validator;

import com.example.Buoi6_Products.Validator.annotation.ValidUserId;
import com.example.Buoi6_Products.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public  boolean isValid(User user, ConstraintValidatorContext context)
    {
        if (user == null)
            return true;
        return user.getId() != null;
    }
}
