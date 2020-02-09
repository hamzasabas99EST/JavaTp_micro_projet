/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Classes.Rv;
import java.util.List;

/**
 *
 * @author Hamza
 */
public interface RvDao {
    public List<Rv> getAllRv();
    public void addRv(Rv d);
    public void DeleteRv(int id);
    public void UpdateRv(int id);

 
}
