package StudentDomen;

import java.util.List;

public class Teacher extends User {
    private List<String> subjects;

    /**
     *
     * @param  firstName first name of teacher
     * @param  lastName  last name of teacher
     * @param  address   address of teacher
     * @param  age       age of teacher
     * @param  subjects  list of subjects which the teacher precedes
     * @return init new Teacher
     */
    public Teacher(String firstName, String lastName, String address, int age, List<String> subjects) {
        super(firstName, lastName, address, age);
        this.subjects = subjects;
    }

    /**
     *
     * @param  subjects new list of subjects which the teacher precedes
     * @return change list of subjects which the teacher precedes
     */
    public void setSubject(List<String> subjects) {
        this.subjects = subjects;
    }

    /**
     *
     * @return String format of Teacher
     */
    @Override
    public String toString() {
        return "Teacher{" + "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", age=" + super.getAge() +
                ", subject='" + subjects + '\'' +
                '}';
    }
}
