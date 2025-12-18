package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ApartmentUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String unitNumber;
    private Integer floor;
    private Long userId;
    public ApartmentUnit(Long id,String unitNumber,Integer floor,Long userId){
        this.id=id;
        @
        this.unitNumber=unitNumber;
        this.floor=floor;
        this.userId=userId;
    }
    public ApartmentUnit() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
