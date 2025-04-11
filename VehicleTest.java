abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with key ignition.");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping using brake pedals.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with self start.");
    }

    @Override
    void stop() {
        System.out.println("Bike is stopping using disc brakes.");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
}
}
