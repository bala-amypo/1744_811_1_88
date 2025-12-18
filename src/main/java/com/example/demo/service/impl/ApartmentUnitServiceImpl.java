package com.example.demo.service.impl;

import com.example.demo.model.ApartmentUnit;
import com.example.demo.repository.ApartmentUnitRepository;
import com.example.demo.service.ApartmentUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApartmentUnitServiceImpl implements ApartmentUnitService {

    @Autowired
    private ApartmentUnitRepository apart;

    @Override
    public ApartmentUnit assignUnitToUser(Long userId, ApartmentUnit unit) {
        unit.setUserId(userId);
        return apart.save(unit);
    }

    @Override
    public ApartmentUnit getUnitByUser(Long userId) {
        return apart.findByUserId(userId);
    }
}
