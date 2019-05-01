package com.netcracker.edu.fapi.validator;

import com.netcracker.edu.fapi.models.User;
import com.netcracker.edu.fapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        Matcher loginMatcher = Pattern.compile("^[a-zA-Z0-9._-]{3,}$").matcher(user.getLogin());
        if (!loginMatcher.matches()){
            errors.rejectValue("login", "login is not correct");
        }
        if (user.getLogin().length() < 4 || user.getLogin().length() > 32) {
            errors.rejectValue("login", "login length is not correct");
        }
        if(!(userService.findByLogin(user.getLogin())==null)){
            errors.rejectValue("username", "username is already exists");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        Matcher passwordMatcher = Pattern.compile("^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]+)$").matcher(user.getPassword());
        if (!passwordMatcher.matches()){
            errors.rejectValue("password", "password is not correct");
        }
        if (user.getPassword().length() < 4) {
            errors.rejectValue("password", "password length is not correct");
        }
    }
}
