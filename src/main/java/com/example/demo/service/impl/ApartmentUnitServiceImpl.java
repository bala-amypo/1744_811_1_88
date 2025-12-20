package com.example.demo.service.impl;

import com.example.demo.model.ApartmentUnit;
import com.example.demo.model.User;
import com.example.demo.repository.ApartmentUnitRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ApartmentUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentUnitServiceImpl implements ApartmentUnitService {

    @Autowired
    private ApartmentUnitRepository apartmentUnitRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ApartmentUnit assignUnitToUser(Long userId, ApartmentUnit unit) {
        User user = userRepository.findById(userId).orElse(null);
        unit.setOwner(user);
        return apartmentUnitRepository.save(unit);
    }

    @Override
    public ApartmentUnit getUnitByUser(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return apartmentUnitRepository.findByOwner(user).orElse(null);
    }
}
