class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);
    }

    @SuppressWarnings("unused")
    Person(String name) {
        this(name, 0);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Kunal",22);
        Person p3 = new Person("Sana", 21);

        p1.display();
        p2.display();
        p3.display();
}
}
