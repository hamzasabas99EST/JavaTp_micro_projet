/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Classes.Creneau;
import java.util.List;

/**
 *
 * @author Hamza
 */
public interface CreneauDao {
     public List<Creneau> getAllCreneau();
    public void addCreneau(Creneau c);
    public void DeleteCreneau(int id);
    public void UpdateCreneau(int id);
}
