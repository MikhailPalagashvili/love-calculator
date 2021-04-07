package com.grantcs.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
    int lower() default 18;

    int upper() default 65;

    String message() default "{invalidAgeMessage}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
