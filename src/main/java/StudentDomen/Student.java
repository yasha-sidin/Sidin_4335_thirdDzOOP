package StudentDomen;

public class Student extends User implements Comparable<Student> {
    private long studId = 0;
    private static long  count = 0;
    public Student(String firstName, String lastName, String address, int age) {
        super(firstName, lastName, address, age);
        studId = ++count;
    }

    public long getStudId() {
        return studId;
    }

    @Override
    public String toString() {
        return "Student {" + "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", age=" + super.getAge() +
                ", studId=" + studId +
                '}';
    }

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
