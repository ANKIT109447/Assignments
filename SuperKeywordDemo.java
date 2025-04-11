class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void displayType() {
        System.out.println("Animal type: " + type);
    }
}

class Dog extends Animal {
    String breed;

    Dog(String type, String breed) {
        super(type);
        this.breed = breed;
    }

    void displayDetails() {
        super.displayType();
        System.out.println("Dog breed: " + breed);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mammal", "Labrador");
        d1.displayDetails();
}
}