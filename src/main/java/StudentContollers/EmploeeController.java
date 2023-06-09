package StudentContollers;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.User;
import StudentService.EmploeeService;

import java.util.Iterator;
import java.util.List;

public class EmploeeController implements iEmploeeController<Emploee>, Iterable<Emploee> {
    private final EmploeeService emploeeService = new EmploeeService();

    @Override
    public void createDefault(String firstName, String lastName, String address, int age) {
        emploeeService.createDefault(firstName, lastName, address, age);
    }

    @Override
    public List<Emploee> getAll() {
        return emploeeService.getAll();
    }

    @Override
    public void createEmploee(String firstName, String lastName, String address, int age, String post) {
        emploeeService.createEmploee(firstName, lastName, address, age, post);
    }

    /**
     *
     * @param emploee this emploee
     * @param <T>     name of Class which must extend Emploee
     * @param salary  salary which will be sent to this emploee
     * @return info about sending salary to this emploee
     */
    public static <T extends Emploee> void paySalary(T emploee, double salary) {
        System.out.println(emploee.getFirstName() + " " + emploee.getLastName() + " - we sent a salary " +
                salary + " rubles to you.");
    }

    @Override
    public Iterator<Emploee> iterator() {
        return new Iterator<Emploee>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < emploeeService.getAll().size();
            }

            @Override
            public Emploee next() {
                if (!hasNext()) {
                    return null;
                }
                return emploeeService.getAll().get(counter++);
            }
        };
    }
}
