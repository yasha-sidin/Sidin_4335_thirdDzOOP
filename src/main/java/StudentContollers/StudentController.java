package StudentContollers;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentService.StudentService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentController implements iUserController<Student>, Iterable<Student> {
    private final StudentService dataService = new StudentService();

    @Override
    public void createDefault(String firstName, String lastName, String address, int age) {
        dataService.createDefault(firstName, lastName, address, age);
    }

    @Override
    public List<Student> getAll() {
        return dataService.getAll();
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < dataService.getAll().size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return dataService.getAll().get(counter++);
            }
        };
    }
}
