package StudentService;


import java.util.List;

public interface iUserService<T> {

    /**
     *
     * @return List of all Users
     */
    List<T> getAll();

    /**
     *
     * @param  firstName  name of User
     * @param  secondName last name of User
     * @param  address    address of User
     * @param  age        age of User
     * @return add new default User in Service
     */
    void createDefault(String firstName, String secondName, String address, int age);
}
