package com.example.k8splayground.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

//@Component
public class FailureStartUp {

    /*
    This class is designed to simulate a failure during the startup of the application. By uncommenting the @Component annotation and the init() method,
    you can trigger a RuntimeException when the application starts, which can be useful for testing how your application handles startup failures.
    */

//    @PostConstruct
//    public void init() {
//        throw new RuntimeException(" ***** Startup failure: Simulating an error during application startup. *****");
//    }
}