
package ClassDAO;
import Classes.Doctor;

import java.util.List;


public interface DoctorDao {
    public List<Doctor> getAllDoctor();
    public void addDoctor(Doctor d);
    public void DeleteDoctor(int id);
    public void UpdateDoctor(int id,Doctor d);


}
