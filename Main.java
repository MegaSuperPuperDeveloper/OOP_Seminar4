import domen.Student;
import domen.StudentGroup;
import domen.StudentIterator;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ivan", 20);
        Student student2 = new Student("Nik", 22);
        Student student3 = new Student("Nikolas", 19);
        Student student4= new Student("Artem", 19);
        Student student5= new Student("Bro", 18);
        Student student6= new Student("Olga", 18);
        Student student7= new Student("Dima", 18);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        StudentGroup group = new StudentGroup(2, students);
        for (Student student : group) {
            System.out.println(student);
        }
        System.out.println("------------");
        Collections.sort(group.getStudentList());
        System.out.println("------------");
        for (Student student : group) {
            System.out.println(student);
        }
    }
}