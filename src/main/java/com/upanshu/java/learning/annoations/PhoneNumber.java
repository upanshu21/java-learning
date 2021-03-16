package com.upanshu.java.learning.annoations;

import com.upanshu.java.learning.validator.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface PhoneNumber {

    String message() default "Invalid Phone number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
