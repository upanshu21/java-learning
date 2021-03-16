package com.upanshu.java.learning.validator;

import com.upanshu.java.learning.annoations.CustomerId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerIdValidator implements ConstraintValidator<CustomerId, String> {

    private static final Logger log = LoggerFactory.getLogger(CustomerIdValidator.class);

    @Override
    public boolean isValid(String customerId, ConstraintValidatorContext constraintValidatorContext) {
        if(!customerId.isEmpty() && customerId.matches(Constants.CUSTOMER_ID_REGEX)) {
            log.info("Received valid customerId of type 'UUID'");
            return true;
        } else {
            log.error("Received invalid customerId");
            return false;
        }
    }
}
