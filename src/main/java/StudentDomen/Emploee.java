package StudentDomen;

public class Emploee extends User {
    private String post;

    public Emploee(String firstName, String lastName, String address, int age, String post) {
        super(firstName, lastName, address, age);
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", age=" + super.getAge() +
                "post='" + post + '\'' +
                '}';
    }
}
