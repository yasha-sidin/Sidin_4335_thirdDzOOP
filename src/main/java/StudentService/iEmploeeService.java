package StudentService;

import StudentDomen.Emploee;

public interface iEmploeeService<T extends Emploee> extends iUserService<Emploee>{

    /**
     *
     * @param  firstName  name of Emploee
     * @param  secondName last name of Emploee
     * @param  address    address of Emploee
     * @param  age        age of Emploee
     * @param  post       type of emploee's work
     * @return add new Emploee with not default post in Service
     */
    void createEmploee(String firstName, String secondName, String address, int age, String post);
}
