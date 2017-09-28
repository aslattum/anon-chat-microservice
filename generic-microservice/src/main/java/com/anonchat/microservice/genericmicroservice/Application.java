/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anonchat.microservice.genericmicroservice;

import com.anonchat.microservice.genericmicroservice.example.TestService;
import com.anonchat.microservice.genericmicroservice.example.TestService2;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author slattumwr
 */
@SpringBootApplication
public class Application {
    
    @Autowired
    TestService2 test2;
    
    public static void main(String[] args){
        System.out.println("-------- main() starting application --------");
        SpringApplication.run(Application.class, args);
    }
    
    @PostConstruct
    public void init(){
        System.out.println("-------- init() application startup complete --------");
//        test.start();
        
//        TestService2 test2 = new TestService2();
        test2.start();
    }
    
}
