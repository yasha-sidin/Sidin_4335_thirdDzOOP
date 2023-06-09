package StudentContollers;

import StudentDomen.Teacher;

import java.util.List;

public interface iTeacherController<T extends Teacher> extends iUserController<Teacher> {
    /**
     *
     * @param  firstName  name of Teacher
     * @param  lastName   last name of Teacher
     * @param  address    address of Teacher
     * @param  age        age of Teacher
     * @param  subjects   list of subjects which the teacher precedes
     * @return add new Teacher with not default subject list in Service
     */
    void createTeacher(String firstName, String lastName, String address, int age, List<String> subjects);

}
