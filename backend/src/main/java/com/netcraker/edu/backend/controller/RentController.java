package com.netcraker.edu.backend.controller;

import com.netcraker.edu.backend.entities.Rent;
import com.netcraker.edu.backend.service.interfaces.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/rent")
public class RentController {

    private RentService rentService;

    @Autowired
    public RentController(RentService rentService) {
        this.rentService = rentService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Rent saveRent(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteRent(@PathVariable(name = "id") Long id) {
        rentService.delete(id);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<List<Rent>> getRentByPrice(@RequestParam(name = "before") double startingPrice, @RequestParam(name = "after") double finalPrice) {
        List<Rent> rents = rentService.findRentsByPriceBetween(startingPrice, finalPrice);
        return new ResponseEntity<>(rents, HttpStatus.ACCEPTED);
    }

    @SuppressWarnings("Duplicates")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Rent> getRentById(@PathVariable(name = "id") Long id) {
        Optional<Rent>rent = rentService.findById(id);
        if (!rent.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(rent.get());
    }

}