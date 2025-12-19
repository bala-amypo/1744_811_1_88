package com.example.demo.controller;

import com.example.demo.model.ApartmentUnit;
import com.example.demo.service.ApartmentUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/units")
public class ApartmentUnitController {

    @Autowired
    private ApartmentUnitService service;

    @PostMapping("/assign/{userId}")
    public ApartmentUnit assign(@PathVariable Long userId,
                                @RequestBody ApartmentUnit unit) {
        return service.assignUnitToUser(userId, unit);
    }

    @GetMapping("/user/{userId}")
    public ApartmentUnit get(@PathVariable Long userId) {
        return service.getUnitByUser(userId);
    }
}
