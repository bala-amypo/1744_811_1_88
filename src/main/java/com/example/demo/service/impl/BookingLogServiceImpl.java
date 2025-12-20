package com.example.demo.service.impl;

import com.example.demo.model.Booking;
import com.example.demo.model.BookingLog;
import com.example.demo.repository.BookingLogRepository;
import com.example.demo.repository.BookingRepository;
import com.example.demo.service.BookingLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingLogServiceImpl implements BookingLogService {

    @Autowired
    private BookingLogRepository bookingLogRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<BookingLog> getLogsByBooking(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        return bookingLogRepository.findByBookingOrderByLoggedAtAsc(booking);
    }
}
