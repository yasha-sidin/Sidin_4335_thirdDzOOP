package StudentDomen;

public class Teacher extends User {
    private String subject;

    public Teacher(String firstName, String lastName, String address, int age, String subject) {
        super(firstName, lastName, address, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" + "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", age=" + super.getAge() +
                ", subject='" + subject + '\'' +
                '}';
    }
}
