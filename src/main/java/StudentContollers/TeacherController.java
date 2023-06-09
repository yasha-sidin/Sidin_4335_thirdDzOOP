package StudentContollers;

import StudentDomen.Emploee;
import StudentDomen.Teacher;
import StudentService.StudentService;
import StudentService.TeacherService;

import java.util.Iterator;
import java.util.List;

public class TeacherController implements iTeacherController<Teacher>, Iterable<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void createTeacher(String firstName, String lastName, String address, int age, List<String> subjects) {
        teacherService.createTeacher(firstName, lastName, address, age, subjects);
    }

    @Override
    public void createDefault(String firstName, String lastName, String address, int age) {
        teacherService.createDefault(firstName, lastName, address, age);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new Iterator<Teacher>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < teacherService.getAll().size();
            }

            @Override
            public Teacher next() {
                if (!hasNext()) {
                    return null;
                }
                return teacherService.getAll().get(counter++);
            }
        };
    }
}
