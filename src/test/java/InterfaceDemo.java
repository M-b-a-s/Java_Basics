public class InterfaceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphism
        myDog.makeSound();        // Woof Woof
        myDog.eat();              // Dog eats bones

        Animal myCat = new Cat();
        myCat.makeSound();        // Meow
        myCat.eat();              // Cat eats fish
    }
}