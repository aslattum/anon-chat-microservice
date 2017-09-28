/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anonchat.microservice.genericmicroservice.example;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

/**
 *
 * @author slattumwr
 */
@Service
public class TestService {

    public TestService() {
        System.out.println("-------- Instantiating Test Service --------");
    }
    
    @PostConstruct
    public void init(){
        System.out.println("-------- Initializing Test Service --------");
    }
    
    public void start(){
        System.out.println("-------- Starting Test Service --------");
    }
}
