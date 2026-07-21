package com.automobile.fourwheeler;

import com.automobile.Vehicle;

/*
 * Create FourWheeler subpackage under automobile package
 * Logan class extends com.automobile.Vehicle class
 * public int speed()
 * – Returns the current speed of the vehicle.
 * public int gps() 
 * – provides facility to control the gps device 
 */

public class Logan extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int currentSpeed;

    public Logan(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.currentSpeed = speed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int speed() {
        return currentSpeed;
    }

    public int gps() {
        System.out.println("Logan GPS active and navigating...");
        return 1; // Returns status/signal indicator
    }
}