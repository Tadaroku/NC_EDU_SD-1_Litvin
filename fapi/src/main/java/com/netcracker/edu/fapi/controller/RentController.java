package com.netcracker.edu.fapi.controller;

import com.netcracker.edu.fapi.models.Rent;
import com.netcracker.edu.fapi.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rent")
public class RentController {

    @Autowired
    private RentService rentService;

    @GetMapping
    public List<Rent> getAllRents(){
        return rentService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Rent saveRent(@RequestBody Rent rent){
        return rentService.save(rent);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRentById(@PathVariable(name = "id") Long id) {
        rentService.delete(id);
    }


    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Rent> getRentById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(rentService.findById(id));
    }
}
