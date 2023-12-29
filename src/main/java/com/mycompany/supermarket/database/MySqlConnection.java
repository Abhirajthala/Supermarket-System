/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermarket.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */

/**
 *
 * @author Admin
 */
public class MySqlConnection  {

  
    public Connection openConnection() {
        try{
            String username ="root";
            String password ="";
            String database="Spring_34B";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + database, username,password
            );
            if(connection !=null){
                System.out.println("Connected to database");
            }else{
                 System.out.println("Connection failed");
            }
            return connection;
        }catch(Exception e){
            return null;
        }
        }


  
    public void closeConnection(Connection conn) {
        try{
            if(conn!=null && !conn.isClosed()){
                conn.close();
                System.out.println("Connection Closed");
            }
        }catch(SQLException e){
            System.out.println("e");
        }
    }
      

  
    public ResultSet runQuery(Connection conn, String query) {
       try{
           Statement statement = conn.createStatement();
           ResultSet rs = statement.executeQuery(query);
           return rs;
       }catch(SQLException e){
           return null;
       }
    }

  
    public int executeUpdate(Connection conn, String query) {
        try{
           Statement statement = conn.createStatement();
           int result = statement.executeUpdate(query);
           return result;
       }catch(SQLException e){
           return -1;
       }}}                                                                                                                                                                   
    

//    @Override
//    public void closeConnection(Connection conn) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public ResultSet runQuery(Connection conn, String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    @Override
//    public int executeUpdate(Connection conn, String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//}

