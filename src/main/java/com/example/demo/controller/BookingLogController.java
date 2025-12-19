package com.example.demo.controller;

import com.example.demo.model.BookingLog;
import com.example.demo.service.BookingLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class BookingLogController {

    @Autowired
    private BookingLogService service;

    @GetMapping("/booking/{bookingId}")
    public List<BookingLog> logs(@PathVariable Long bookingId) {
        return service.getLogsByBooking(bookingId);
    }
}
