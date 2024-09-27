package com.example.springappbean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringAppBeanApplication {

    public static void main(String[] args) {
//        традиционный способ
//        Address address = new Address("High Street", 1000);
//        Company company = new Company(address);


        //Bean
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Company company = context.getBean(Company.class);


//        System.out.println("Company Address: "
//                + company.getAddress().getStreet()
//                + ", "
//                + company.getAddress().getNumber());
//
//        System.out.println("Engine Type: "
//                + company.getEngine().getType()
//                + ", Horsepower: "
//                + company.getEngine().getHorsepower());
//
//        System.out.println("Transmission Type: "
//                + company.getTransmission().getType());


        System.out.println("Company Address: " + company.getAddress().getStreet());
        System.out.println("Company Engine Type: " + company.getEngine().getType());
    }

}
