package com.automobile.fourwheeler;

import com.automobile.Vehicle;

/*
 * Ford class extends com.automobile.Vehicle class
 * public int speed()
 * – Returns the current speed of the vehicle.
 * public int tempControl() 
 * – provides facility to control the air conditioning device which is available in the car
 */

public class Ford extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int currentSpeed;

    public Ford(String modelName, String registrationNumber, String ownerName, int speed) {
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

    public int tempControl() {
        System.out.println("Ford AC temperature set to optimal 22°C.");
        return 22; // Returns set temperature
    }
}