package StudentService;

import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;

    /**
     *
     * @return new StudentService like a List<Student>
     */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /**
     *
     * @return list of all Students in StudentService
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     *
     * @param  firstName  name of Student
     * @param  secondName last name of Student
     * @param  address    address of Student
     * @param  age        age of Student
     * @return add new Student in StudentService
     */
    @Override
    public void createDefault(String firstName, String secondName, String address, int age) {
        Student st = new Student(firstName, secondName, address, age, count);
        count++;
        students.add(st);
    }

    /**
     *
     * @return sorted StudentService List by FIO
     */
    public List<Student> getSortedByFIOStudentList() {
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new UserComparator<Student>());
        return newStudList;
    }
}
