package lessons21_30;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.sleep();
        dog.bark();
        dog.eat();
        dog.showName();
    }
}
