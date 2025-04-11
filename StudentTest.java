class Student {
    String name;
    int age;
    String course;

    Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    Student(String name) {
        this.name = name;
        age = 0;
        course = "Not Assigned";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        course = "Not Assigned";
    }

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("vaibhav",19);
        Student s2 = new Student("Ankit");
        Student s3 = new Student("Priya", 20);
        Student s4 = new Student("Deeksha", 22, "Computer Science");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
}
}
