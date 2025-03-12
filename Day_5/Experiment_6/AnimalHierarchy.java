package Day_5.Experiment_6;
//base class
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    public void walk() {
        System.out.println(name + " is walking.");
    }
}

//derived class
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.walk();
        dog.bark();
    }
}

