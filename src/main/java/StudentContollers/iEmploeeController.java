package StudentContollers;

import StudentDomen.Emploee;

public interface iEmploeeController<T extends Emploee> extends iUserController<Emploee>{
    /**
     *
     * @param  firstName  name of Emploee
     * @param  lastName last name of Emploee
     * @param  address    address of Emploee
     * @param  age        age of Emploee
     * @param  post       type of emploee's work
     * @return add new Emploee with not default post in Service
     */
    void createEmploee(String firstName, String lastName, String address, int age, String post);
}
