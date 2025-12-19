package com.example.demo.controller;

import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService service;

    @PostMapping("/{facilityId}/{userId}")
    public Booking create(@PathVariable Long facilityId,
                          @PathVariable Long userId,
                          @RequestBody Booking booking) {
        return service.createBooking(facilityId, userId, booking);
    }

    @PutMapping("/cancel/{bookingId}")
    public Booking cancel(@PathVariable Long bookingId) {
        return service.cancelBooking(bookingId);
    }

    @GetMapping("/{bookingId}")
    public Booking get(@PathVariable Long bookingId) {
        return service.getBooking(bookingId);
    }
}
