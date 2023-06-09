package StudentContollers;

import StudentDomen.User;

import java.util.List;

public interface iUserController<T extends User> {

    /**
     *
     * @param  firstName  name of User
     * @param  lastName last name of User
     * @param  address    address of User
     * @param  age        age of User
     * @return add new default User in Service
     */
    void createDefault(String firstName, String lastName, String address, int age);

    /**
     *
     * @return list of all users
     */
    List<T> getAll();
}
