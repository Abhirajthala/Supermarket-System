/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarket.dao;

import com.mycompany.supermarket.database.MySqlConnection;
import com.mycompany.supermarket.model.RegisterModel;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author Admin
 */
public class AuthDAO extends MySqlConnection{
    public boolean register(RegisterModel registerModel){
        try{
            PreparedStatement ps = null;
            Connection conn = openConnection();
            
            String sql= "INSERT INTO users(username,password,email) VALUES(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,registerModel.getUsername());
            ps.setString(2,registerModel.getPassword());
            ps.setString(3,registerModel.getEmail());
            
            int result = ps.executeUpdate();
            //Use executeUpdate for query that has create,Update or Delete
            if(result == -1){
                return false;
            }else{
                return false;
            }
            
        }catch(Exception e){
            return false;
        }
    }
}
/**
 *
 * @author Admin
 */

