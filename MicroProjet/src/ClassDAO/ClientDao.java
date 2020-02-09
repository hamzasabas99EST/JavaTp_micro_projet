/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Classes.Client;
import java.util.List;

/**
 *
 * @author Hamza
 */
public interface ClientDao {
    public List<Client> getAllClient();
    public void addClient(Client c);
    public void DeleteClient(int id);
    public void UpdateClient(int id);

}
