class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 101, 50000);
        e1.display();
}
}
