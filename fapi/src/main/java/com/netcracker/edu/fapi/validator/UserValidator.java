//package com.netcracker.edu.fapi.validator;
//
//import com.netcracker.edu.fapi.models.User;
//import com.netcracker.edu.fapi.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//@Component
//public class UserValidator implements Validator {
//
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        return User.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        User user = (User) o;
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
//
//        Matcher matcher = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$").matcher(user.getEmail());
//        if (!matcher.matches()){
//            errors.rejectValue("email", "email is not correct");
//        }
//        if (user.getEmail().length() < 4 || user.getEmail().length() > 32) {
//            errors.rejectValue("email", "email length is not correct");
//        }
//        if(!(userService.findByLogin(user.getUsername())==null)){
//            errors.rejectValue("username", "username is already exists");
//        }
//
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
//        if (user.getPassword().length() < 4) {
//            errors.rejectValue("password", "password length is not correct");
//        }
//    }
//}
