package org.iesfm.library;

import java.util.Objects;

public class Vehicle {

    public Vehicle(String id, int numSeats, int maxSpeed, String fuelType) {
        this.id = id;
        this.numSeats = numSeats;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    private String id;
    private int numSeats;
    private int maxSpeed;
    private String fuelType;

}