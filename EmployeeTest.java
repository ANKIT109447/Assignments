class Employee {
    void work() {
        System.out.println("Employee is working...");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing the team.");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer is writing code.");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Developer();

        emp1.work();
        emp2.work();
}
}
