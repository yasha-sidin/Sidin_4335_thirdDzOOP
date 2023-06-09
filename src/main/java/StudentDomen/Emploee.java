package StudentDomen;

public class Emploee extends User {
    private String post;

    /**
     *
     * @param  firstName first name of emploee
     * @param  lastName  last name of emploee
     * @param  address   address of emploee
     * @param  age       age of emploee
     * @param  post      type of emploee's work
     * @return init new Emploee
     */
    public Emploee(String firstName, String lastName, String address, int age, String post) {
        super(firstName, lastName, address, age);
        this.post = post;
    }

    /**
     *
     * @return post
     */
    public String getPost() {
        return post;
    }

    /**
     *
     * @param  post type of emploee's work
     * @return new post
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     *
     * @return String format of Emploee
     */
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
