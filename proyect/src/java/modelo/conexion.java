/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    Connection con;
    public  Connection getConnection(){
        try {
            Class.forName("com.mysql.jbdc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto","root","1234");
        }catch(Exception e){
        }
        return con;
    }
}
