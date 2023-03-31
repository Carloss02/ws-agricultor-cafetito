/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cafe.wsRest.dto;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class WsActiveDto {
    private String message; 
    private boolean status; 
    private Date lastChecked; 

    public WsActiveDto() {
    }

    public WsActiveDto(String message, boolean status, Date lastChecked) {
        this.message = message;
        this.status = status;
        this.lastChecked = lastChecked;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getLastChecked() {
        return lastChecked;
    }

    public void setLastChecked(Date lastChecked) {
        this.lastChecked = lastChecked;
    }
    
    
}
