/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anonchat.microservice.genericmicroservice.example;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author slattumwr
 */
@Component
public class TestService2 {
    
    @Autowired
    TestService test;
    
    public TestService2() {
        System.out.println("-------- Instantiating Test Service2 --------");
    }
    
    @PostConstruct
    public void init(){
        System.out.println("-------- Initializing Test Service2 --------");
    }
    
    public void start(){
        System.out.println("-------- Starting Test Service2 --------");
        test.start();
    }
    
}
