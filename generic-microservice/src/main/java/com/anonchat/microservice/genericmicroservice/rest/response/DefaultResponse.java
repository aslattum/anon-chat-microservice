/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anonchat.microservice.genericmicroservice.rest.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author slattumwr
 */
@XmlRootElement(name="responseText")
@XmlAccessorType(XmlAccessType.FIELD)
public class DefaultResponse {
    
    @XmlTransient
    private String responseText;

    public DefaultResponse() {
    }

    public DefaultResponse(String responseText) {
        this.responseText = responseText;
    }

    @XmlAttribute(name="value")
    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }
}
