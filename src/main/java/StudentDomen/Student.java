package StudentDomen;

public class Student extends User implements Comparable<Student> {
    private long studId = 0;
    private static long  count = 0;

    /**
     *
     * @param  firstName first name of student
     * @param  lastName  last name of student
     * @param  address   address of student
     * @param  age       age of student
     * @param  studId    id of Student
     * @return init new Student
     */
    public Student(String firstName, String lastName, String address, int age, int studId) {
        super(firstName, lastName, address, age);
        this.studId = studId;
    }

    /**
     *
     * @return studId of student
     */
    public long getStudId() {
        return studId;
    }

    /**
     *
     * @return String format of student
     */
    @Override
    public String toString() {
        return "Student {" + "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", age=" + super.getAge() +
                ", studId=" + studId +
                '}';
    }

    /**
     *
     * @param  o the object to be compared.
     * @return int for sort function
     */
    @Override
    public int compareTo(Student o) {
        if(this.getAge()==o.getAge())
        {
            if(this.getStudId()==o.getStudId())
            {
                return 0;
            }
            if(this.getStudId()<o.getStudId())
            {
                return -1;
            }
            return 1;
        }
        if(this.getAge()<o.getAge())
        {
            return -1;
        }
        return 1;
    }
}
