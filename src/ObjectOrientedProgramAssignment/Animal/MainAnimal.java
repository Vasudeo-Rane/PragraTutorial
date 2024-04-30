package ObjectOrientedProgramAssignment.Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.makeSound();
        lion.feed();

        AquaticAnimals penguin = new Penguin();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();

        Climbable monkey = new Monkey();
        monkey.climb();
        monkey.feed();
        monkey.makeSound();

    }

}
