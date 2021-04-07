package com.grantcs.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
    private int lower;
    private int upper;

    @Override
    public void initialize(Age constraintAnnotation) {
        this.lower = constraintAnnotation.lower();
        this.upper = constraintAnnotation.upper();
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        return age == null || age < lower || age > upper ? false : true;
    }
}
