import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Teacher tc = new Teacher("John", "Gibs", "Moscow", 39, "Math");

        // realisation of homework3
        Student st1 = new Student("Mary", "Cramber", "Moscow", 18);
        Student st2 = new Student("John", "Chromov", "Spb", 19);
        Student st3 = new Student("Ivan", "Homov", "Smolensk", 20);
        Student st4 = new Student("Julia", "Zilova", "Kirov", 18);
        Student st5 = new Student("Max", "Petrov", "Moscow", 18);
        Student st6 = new Student("Leo", "Koleb", "Spb", 17);
        Student st7 = new Student("Gleb", "Makarov", "Moscow", 21);
        Student st8 = new Student("Yasha", "Sidin", "Kirov", 18);
        Student st9 = new Student("Nataly", "Mirova", "Kazan", 18);
        Student st10 = new Student("Kate", "Kubova", "Kazan", 19);
        Student st11 = new Student("Boris", "Dorov", "Moscow", 18);
        Student st12 = new Student("Ivan", "Ivanov", "Kirov", 18);
        Student st13 = new Student("Mark", "Petrov", "Spb", 20);
        Student st14 = new Student("Thomas", "Shalby", "Moscow", 19);

        StudentGroup sg1 = new StudentGroup(new ArrayList<Student>(List.of(st1, st2)));
        StudentGroup sg2 = new StudentGroup(new ArrayList<Student>(List.of(st5, st6)));
        StudentGroup sg3 = new StudentGroup(new ArrayList<Student>(List.of(st7, st8)));
        StudentGroup sg4 = new StudentGroup(new ArrayList<Student>(List.of(st9, st10, st3, st4)));
        StudentGroup sg5 = new StudentGroup(new ArrayList<Student>(List.of(st11, st12)));
        StudentGroup sg6 = new StudentGroup(new ArrayList<Student>(List.of(st13, st14)));

        StudentSteam ss1 = new StudentSteam(new ArrayList<StudentGroup>(List.of(sg1, sg2)));
        StudentSteam ss2 = new StudentSteam(new ArrayList<StudentGroup>(List.of(sg3, sg4)));
        StudentSteam ss3 = new StudentSteam(new ArrayList<StudentGroup>(List.of(sg5, sg6)));

        // task_2
        for (StudentGroup group : ss1) {
            System.out.println(group.toString());
        }

        System.out.printf("\n----------------------------------------------------\n\n");

        // task_3 or task_1, task_2 with *
        Collections.sort(ss2.getSteam());
        System.out.println(ss2);
    }
}
