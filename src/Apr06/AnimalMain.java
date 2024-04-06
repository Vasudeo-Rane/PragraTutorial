package Apr06;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.talk();
        animal.walk();
        animal.makeSound();
        System.out.println("animal height is " + animal.height);
        System.out.println("animal color is " + animal.color);
        System.out.println(animal);
    }
}
