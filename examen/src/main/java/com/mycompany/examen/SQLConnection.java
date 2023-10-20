/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mega0
 */
public class SQLConnection {
    
    static Connection conexion = null;
    
    static String usuario = "sa";
    static String contrasena = "SQLServersa";
    static String db = "examen";
    static String ip = "localhost";
    static String puerto = "1433";
    
    public static Connection conectarBD(){
        
        return connection();
    }
    
    public static Connection connection(){
        conexion = null;
        try {
            String cadena  = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+db;
            
            conexion = (Connection) DriverManager.getConnection(cadena, usuario, contrasena);
            System.out.println("Conectado viejon");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
    
    
}
