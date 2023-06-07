package StudentDomen;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private static int count = 0;
    List<Student> group;
    private int idGroup;

    public StudentGroup(List<Student> group) {
        this.group = group;
        idGroup = ++count;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public int getIdGroup() {
        return idGroup;
    }

    /**
     *
     * @return StudentGroup like String which include idGroup, amount of Students in group, list of Students with info about them
     */

    @Override
    public String toString() {
        int count = 1;
        StringBuilder groupInfo = new StringBuilder();
        groupInfo.append("StudentGroup {\n");
        groupInfo.append("\t" + "idGroup: " + idGroup + ",\n");
        groupInfo.append("\t" + "StudentsInGroup: " + this.group.size() + ",\n");
        groupInfo.append("\tStudentsList: \n");
        for (Student student : this.group) {
            if (count == this.group.size()) {
                groupInfo.append("\t\t" + student.toString() + "\n}");
                return groupInfo.toString();
            }
            groupInfo.append("\t\t" + student.toString() + ",\n");
            count++;
        }
        return "";
    }

    /**
     *
     * @return realization of implemented method from Iterator in class StudentGroup to use foreach with this and Student
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < group.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return group.get(counter++);
            }
        };
    }

    /**
     *
     * @param group the object to be compared.
     * @return      realization of implemented method from Comparable in class StudentGroup to use sort method with this
     */

    @Override
    public int compareTo(StudentGroup group) {
        if(this.size() == group.size()) {

            if(this.idGroup == group.idGroup) {
                return 0;
            }
            if(this.idGroup < group.idGroup)
            {
                return -1;
            }
            return 1;

        } if(this.size() > group.size()) {
            return -1;
        }
        return 1;
    }

    /**
     *
     * @return size of StudentGroup
     */

    public int size() {
        int sum = 0;
        for (Student student : this.group) {
            sum += 1;
        }
        return sum;
    }
}
