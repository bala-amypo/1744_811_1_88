package com.example.demo.controller;

import com.example.demo.model.ApartmentUnit;
import com.example.demo.service.ApartmentUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/units")
public class ApartmentUnitController {

    @Autowired
    private ApartmentUnitService apartmentUnitService;

    @PostMapping("/assign/{userId}")
    public ApartmentUnit assignUnit(
            @PathVariable Long userId,
            @RequestBody ApartmentUnit unit) {
        return apartmentUnitService.assignUnitToUser(userId, unit);
    }

    @GetMapping("/user/{userId}")
    public ApartmentUnit getUnitByUser(@PathVariable Long userId) {
        return apartmentUnitService.getUnitByUser(userId);
    }
}
