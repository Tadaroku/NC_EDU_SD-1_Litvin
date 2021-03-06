package com.netcraker.edu.backend.dto;

import com.netcraker.edu.backend.dto.dto.*;
import com.netcraker.edu.backend.entities.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class Converter {



    public UserDto userEntityToUserDtoConverter(User user) {
        UserDto userDto = null;
        if (user != null) {
            userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setLogin(user.getUsername());
            userDto.setPassword(user.getPassword());
        }
        return userDto;
    }


    public RentDto rentEntityToRentDtoConverter(Rent rent) {
        RentDto rentDto = null;
        if (rent != null) {
            rentDto = new RentDto();
            rentDto.setId(rent.getId());
            rentDto.setStartDate(localDateToStringConverter(rent.getStartDate()));
            rentDto.setEndDate(localDateToStringConverter(rent.getEndDate()));
            rentDto.setPrice(rent.getPrice());


        }
        return rentDto;
    }

    public ModelDto modelEntityToModelDtoConverter(Model model) {
        ModelDto modelDto = null;
        if (model != null) {
            modelDto = new ModelDto();
            modelDto.setId(model.getId());
            modelDto.setBrand(model.getBrand());
            modelDto.setModelName(model.getModelName());
            modelDto.setDescription(model.getDescription());
        }
        return modelDto;
    }

    public CarDto carEntityToCarDtoConverter(Car car) {
        CarDto carDto = null;
        if (car != null) {
            carDto = new CarDto();
            carDto.setId(car.getId());
            carDto.setColor(car.getColor());
            carDto.setEngineType(car.getEngineType());
            carDto.setMileage(car.getMileage());
            carDto.setProvider(car.getProvider());
            carDto.setTransmission(car.getTransmission());
            carDto.setYearOfIssue(car.getYearOfIssue());
            carDto.setStatus(String.valueOf(car.getStatus()));
            carDto.setActive(car.isCondition());
        }
        return carDto;
    }

    private String localDateToStringConverter(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        if (localDate != null) {
            return localDate.format(formatter);
        } else
            return null;
    }
}
