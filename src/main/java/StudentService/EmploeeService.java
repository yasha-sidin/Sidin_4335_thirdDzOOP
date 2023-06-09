package StudentService;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService implements iEmploeeService<Emploee>{
    private List<Emploee> emploees;

    /**
     *
     * @return new EmploeeService like a List<Emploee>
     */
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    /**
     *
     * @return List of all Emploees in EmploeeService
     */
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    @Override
    public void createDefault(String firstName, String secondName, String address, int age) {
        Emploee defEmp = new Emploee(firstName, secondName, address, age, "Basic");
        emploees.add(defEmp);
    }

    /**
     *
     * @return sorted EmploeeService List by FIO
     */
    public List<Emploee> getSortedByFIOEmploeeList() {
        List<Emploee> newEmploeeList = new ArrayList<Emploee>(emploees);
        newEmploeeList.sort(new UserComparator<Emploee>());
        return newEmploeeList;
    }

    @Override
    public void createEmploee(String firstName, String secondName, String address, int age, String post) {
        Emploee emp = new Emploee(firstName, secondName, address, age, post);
        emploees.add(emp);
    }

}
