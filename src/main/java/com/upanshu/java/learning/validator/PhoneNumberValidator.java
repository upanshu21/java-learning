package com.upanshu.java.learning.validator;

import com.upanshu.java.learning.annoations.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    private static final Logger log = LoggerFactory.getLogger(PhoneNumberValidator.class);

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if(!phoneNumber.isEmpty() && phoneNumber.matches(Constants.PHONE_NUMBER_REGEX) && phoneNumber.length() < 12) {
            log.info("Valid Phone number received");
            return true;
        } else {
            log.error("Invalid Phone number received");
            return false;
        }
    }
}
