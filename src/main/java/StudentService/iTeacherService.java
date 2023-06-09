package StudentService;

import StudentDomen.Teacher;

import java.util.List;

public interface iTeacherService<T extends Teacher> extends iUserService<Teacher> {
    /**
     *
     * @param  firstName  name of Teacher
     * @param  secondName last name of Teacher
     * @param  address    address of Teacher
     * @param  age        age of Teacher
     * @param  subjects   list of subjects which the teacher precedes
     * @return add new Teacher with not default subjects list in Service
     */
    void createTeacher(String firstName, String secondName, String address, int age, List<String> subjects);
}
