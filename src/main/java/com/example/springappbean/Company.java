package com.example.springappbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

    private Address address;
    private Engine engine;
    private Transmission transmission;

    @Autowired
    public Company(Address address, Engine engine, Transmission transmission) {
        this.address = address;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Address getAddress() {
        return address;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }
}
