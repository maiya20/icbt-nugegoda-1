/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.mywebapp;

/**
 *
 * @author PC
 */
public class UserSession {
    private String username;
    private String remarks;

    public UserSession() {
        this.username = "";
        this.remarks = "";
    }

    public UserSession(String username, String remarks) {
        this.username = username;
        this.remarks = remarks;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
