package com.example.demo.repository;

import com.example.demo.model.ApartmentUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentUnitRepository
        extends JpaRepository<ApartmentUnit, Long> {

    Apartment findByOwner(User user)
}
