package com.example.springappbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.example.springappbean")
public class Config {

    @Bean
    public Address  getAddress(){
        return new Address("High Street", 1000);
    }

    @Bean
    public Engine getEngine() {
        return new Engine("v8", 5);
    }

    @Bean
    public Transmission getTransmission() {
        return new Transmission("sliding");
    }

//    @Bean
//    public Company getCompany() {
//        return new Company(getAddress(), getEngine(), getTransmission());
//    }
}
