/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import ClassDAO.DoctorDao;
import ClassDAO.TestConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hamza
 */
public class DoctorDaoImpl implements DoctorDao{

    @Override
    public List<Doctor> getAllDoctor() {
        List<Doctor> lm=new ArrayList<Doctor>();
        Connection con=TestConection.getCon();
        String q="SELECT * FROM medcins";
        try{
           PreparedStatement ps=con.prepareStatement(q);
           ps.executeQuery(q);

        }catch(SQLException e){
        }
        
        return lm;
    }

    @Override
    public void addDoctor(Doctor d) {
        Connection con=TestConection.getCon();
        String q="INSERT INTO medcins VALUES (?,?,?)";
        try{
           PreparedStatement ps=con.prepareStatement(q);
           ps.setString(1,d.GetTitre());
           ps.setString(2,d.GetNom());
           ps.setString(3,d.GetPrenom());
           ps.executeUpdate(q);

        }catch(SQLException e){
        }
        }

    @Override
    public void DeleteDoctor(int id) {
         Connection con=TestConection.getCon();
        String q="DELETE FROM medcins WHERE id=?";
        try{
           PreparedStatement ps=con.prepareStatement(q);
            ps.setInt(1,id);

           ps.executeUpdate(q);

        }catch(SQLException e){
        }
    }

    @Override
    public void UpdateDoctor(int id,Doctor d) {
        Connection con=TestConection.getCon();
        String q="UPDATE medcins SET titre=?,nom=?,prenom=? where id=?'";
        try{
           PreparedStatement ps=con.prepareStatement(q);
           ps.setString(1,d.GetTitre());
           ps.setString(2,d.GetNom());
           ps.setString(3,d.GetPrenom());
           ps.setInt(4,id);

           ps.executeUpdate(q);

        }catch(SQLException e){
        }
    }
    
    
}
