package static_keyword;

public class Student {
    int count = 0; // non-static method
    static int staticCount = 0;

    Student() {
        count++;
        staticCount++;
    }

    void totalStudent() {
        System.out.println("Total Students: " +count);
        System.out.println("In static variable Total Students: " +staticCount);
    }

    // static method
    static void display() {
        // totalStudent();  // error, because static method can only use static members
        System.out.println("Static method called");
    }
}
