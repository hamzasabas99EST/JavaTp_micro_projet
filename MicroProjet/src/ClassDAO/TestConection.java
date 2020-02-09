/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hamza
 */
public class TestConection {
public class TestCOnn {
   
       Connection con;
       Statement stm;
       ResultSet rst;
     public  void connexion(){
        try{    
        Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/microprojet?useSSL=false","root","");
           stm=con.createStatement();
           System.out.println("Bien");
       }catch(ClassNotFoundException | SQLException e){
           System.out.println("Erreur de chargement de pilote:"+e);
        }
    }
}

}
 

