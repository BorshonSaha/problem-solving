package linkedList;

import java.util.LinkedList;

public class StudentTest {
    static void main() {
        LinkedList<Student> students = new LinkedList<>();

        Student student1 = new Student(1, "Borshon Saha");
        Student student2 = new Student(2, "David Miller");

        students.add(student1);
        students.add(student2);

        System.out.println(students);

        for(Student student : students) {
            System.out.println(student);
        }
    }
}
