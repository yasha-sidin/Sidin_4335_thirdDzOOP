package StudentContollers;

import StudentDomen.User;
import StudentService.iUserService;

import java.util.List;

public class AverageAge<T extends iUserService> {

    /**
     *
     * @param  controllerList list of Users
     * @return AverageAge of user
     * @param  <T>            general class which extends iUserController
     */
    public static <T extends iUserController> double getAverageAge(T controllerList) {
        User user;
        int mean = 0;
        List serviceMembers = controllerList.getAll();
        int amountOfServiceMembers = controllerList.getAll().size();
        for (int i = 0; i < amountOfServiceMembers; i++) {
            user = (User)serviceMembers.get(i);
            mean += user.getAge();
        }

        return (double)(mean / amountOfServiceMembers);
    }
}
