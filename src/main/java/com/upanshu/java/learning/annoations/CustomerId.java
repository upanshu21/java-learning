package com.upanshu.java.learning.annoations;

import com.upanshu.java.learning.validator.CustomerIdValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = CustomerIdValidator.class)
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface CustomerId {

    String message() default "Invalid Customer Id";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
