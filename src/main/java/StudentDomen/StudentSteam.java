package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private static int count = 0;
    private int idSteam;
    private List<StudentGroup> steam;

    public StudentSteam(List<StudentGroup> steam) {
        this.steam = steam;
        idSteam = ++count;
    }

    public int getIdSteam() {
        return idSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    private StringBuilder setDoubleTab(String str) {
        String[] array = str.split("\n");
        StringBuilder strTab = new StringBuilder();
        for (String item : array) {
            item = "\t\t" + item;
            strTab.append(item + "\n");
        }
        return strTab;
    }

    /**
     *
     * @return StudentSteam like String which include idSteam, amount of groups in steam, info about StudentGroup
     */
    @Override
    public String toString() {
        int count = 1;
        StringBuilder groupInfo = new StringBuilder();
        groupInfo.append("StudentSteam {\n");
        groupInfo.append("\t" + "idSteam: " + idSteam + ",\n");
        groupInfo.append("\t" + "StudentGroupsInSteam: " + this.steam.size() + ",\n");
        groupInfo.append("\tStudentsGroups: \n");
        for (StudentGroup group : this.steam) {
            if (count == this.steam.size()) {
                groupInfo.append(setDoubleTab(group.toString()) + "\n}");
                return groupInfo.toString();
            }
            groupInfo.append(setDoubleTab(group.toString()) + ",\n");
            count++;
        }
        return "";
    }

    /**
     *
     * @return realization of implemented method from Iterator in class StudentSteam to use foreach with this and StudentGroup
     */

    @Override
    public Iterator<StudentGroup> iterator() {

        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < steam.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return steam.get(counter++);
            }
        };
    }
}
