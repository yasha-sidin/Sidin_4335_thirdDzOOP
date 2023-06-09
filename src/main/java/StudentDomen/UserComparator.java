package StudentDomen;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    /**
     *
     * @param  o1 the first object to be compared.
     * @param  o2 the second object to be compared.
     * @return int 0 or 1 in depending on comparisons of o1 and o2(0 - true, 1 - false)
     */
    @Override
    public int compare(T o1, T o2) {
        int resultComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if(resultComparing == 0) {
            resultComparing = o1.getLastName().compareTo(o2.getLastName());
            return resultComparing;
        }
        return resultComparing;
    }
}
