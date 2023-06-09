package StudentService;

import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iTeacherService<Teacher> {
    private List<Teacher> teachers;

    /**
     *
     * @return new TeacherService like a List<Teacher>
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public void createTeacher(String firstName, String secondName, String address, int age, List<String> subjects) {
        Teacher tr = new Teacher(firstName, secondName, address, age, subjects);
        teachers.add(tr);
    }

    /**
     *
     * @return list of all Teachers in TeacherService
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void createDefault(String firstName, String secondName, String address, int age) {
        Teacher tr = new Teacher(firstName, secondName, address, age, new ArrayList<String>());
        teachers.add(tr);
    }

    /**
     *
     * @return sorted TeacherService List by FIO
     */
    public List<Teacher> getSortedByFIOTeacherList() {
        List<Teacher> newStudList = new ArrayList<Teacher>(teachers);
        newStudList.sort(new UserComparator<Teacher>());
        return newStudList;
    }

    /**
     *
     * @return print TeacherService List which have sorted by FIO
     */
    public void printSortedByFIOTeacherList() {
        teachers = getSortedByFIOTeacherList();
        for(Teacher tr : teachers) {
            System.out.println(tr.toString());
        }
    }
}
