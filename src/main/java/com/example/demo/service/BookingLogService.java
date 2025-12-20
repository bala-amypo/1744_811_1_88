package com.example.demo.service;

import com.example.demo.model.BookingLog;

import java.util.List;

public interface BookingLogService {
    List<BookingLog> getLogsByBooking(Long bookingId);
}
