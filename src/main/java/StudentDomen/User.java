package StudentDomen;

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    /**
     *
     * @param firstName first name of user
     * @param lastName  last name of user
     * @param address   address of user
     * @param age       age of user
     */
    public User(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    /**
     *
     * @return first name of user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return last name of user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return address of user
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return age of user
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param  firstName new first name of user
     * @return change first name of user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @param  lastName new last name of user
     * @return change last name of user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @param  address new address of user
     * @return change address of user
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @param  age new age of user
     * @return change age of user
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return String format of user
     */
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
