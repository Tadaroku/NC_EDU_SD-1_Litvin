package com.netcracker.edu.fapi.validator;

import com.netcracker.edu.fapi.models.Rent;
import com.netcracker.edu.fapi.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class RentValidator implements Validator {

    @Autowired
    RentService rentService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Rent.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Rent rent = (Rent) o;
        if (rent.getPrice() < 1) {
            errors.rejectValue("rent", "rent cost should be positive");
        }


    }
}
