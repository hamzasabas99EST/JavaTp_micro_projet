/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import ClassDAO.ClientDao;
import ClassDAO.TestConection;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Hamza
 */
public class ClientDaoImpl implements ClientDao{
    @Override
    public List<Client> getAllClient() {
        List<Client> lc=new ArrayList<Client>();
        Connection con=TestConection.getCon();
        String q="SELECT * FROM clients";
        try{
           PreparedStatement ps=con.prepareStatement(q);
           ps.executeQuery(q);

        }catch(SQLException e){
        }
        
        return lc;
    }

    @Override
    public void addClient(Client c) {
        Connection con=TestConection.getCon();
        String q="INSERT INTO clients VALUES (?,?,?)";
        try{
           PreparedStatement ps=con.prepareStatement(q);
           ps.setString(1,c.GetTitre());
           ps.setString(2,c.GetNom());
           ps.setString(3,c.GetPrenom());
           ps.executeUpdate(q);

        }catch(SQLException e){
        }
         
    }

    @Override
    public void DeleteClient(int id) {
         Connection con=TestConection.getCon();
        String q="DELETE FROM clients WHERE id=?";
        try{
           PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,id);

           ps.executeUpdate(q);

        }catch(SQLException e){
        }

    }

    @Override
    public void UpdateClient(int id,Client c) {
      Connection con=TestConection.getCon();
        String q="UPDATE clients SET titre=?,nom=?,prenom=? where id=?'";
        try{
           PreparedStatement ps=con.prepareStatement(q);
           ps.setString(1,c.GetTitre());
           ps.setString(2,c.GetNom());
           ps.setString(3,c.GetPrenom());
           ps.setInt(4,id);

           ps.executeUpdate(q);

        }catch(SQLException e){
        }}
    
}
