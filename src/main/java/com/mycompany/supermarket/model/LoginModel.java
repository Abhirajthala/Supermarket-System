/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarket.model;

/**
 *
 * @author Admin
 */
public class LoginModel {
    private String email;
    private String password;
    public LoginModel(String email,String password){
        this.email=email;
        this.password = password;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
}

