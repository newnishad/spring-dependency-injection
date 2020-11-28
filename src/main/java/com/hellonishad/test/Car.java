package com.hellonishad.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    @Autowired
    private Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public void drive(){
        System.out.println("Car using Tire = " + tire);
    }
}