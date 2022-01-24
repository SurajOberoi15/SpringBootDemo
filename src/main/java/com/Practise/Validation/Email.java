package com.Practise.Validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = {EmailValidation.class})
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface Email {

    String message() default "Invalid Email ID";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}