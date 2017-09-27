/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anonchat.microservice.genericmicroservice.rest;

import com.anonchat.microservice.genericmicroservice.rest.response.DefaultResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author slattumwr
 */
@RestController
public class DefaultController {
    
    private final static String TEST_RESPONSE = "Hello! This is a test microservice for the anon-chat app!";
    
    @CrossOrigin
    @ApiOperation(httpMethod = "GET", value = "Returns a test response from the microservice")
    @RequestMapping(value = "/api/test", produces = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.GET)
    public String returnTestResponse() throws Exception{
        return TEST_RESPONSE;
    }
    
    @CrossOrigin
    @ApiOperation(httpMethod = "GET", value = "Returns a test JSON response from the microservice")
    @RequestMapping(value = "/api/test/json", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public DefaultResponse returnTestJSONResponse() throws Exception{
        return new DefaultResponse(TEST_RESPONSE);
    }
    
    @CrossOrigin
    @ApiOperation(httpMethod = "GET", value = "Returns a test XML response from the microservice")
    @RequestMapping(value = "/api/test/xml", produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public DefaultResponse returnTestXMLResponse() throws Exception{
        return new DefaultResponse(TEST_RESPONSE);
    }
}
