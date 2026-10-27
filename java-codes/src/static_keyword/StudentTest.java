package static_keyword;

public class StudentTest {
    static void main() {
        Student s1 = new Student();
        s1.totalStudent();

        Student s2 = new Student();
        s2.totalStudent();

        Student s3 = new Student();
        s3.totalStudent();

        Student.display();
    }
}
