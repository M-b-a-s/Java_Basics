// Define an interface
interface Animal {
    void makeSound();   // abstract method
    void eat();
}

// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}

