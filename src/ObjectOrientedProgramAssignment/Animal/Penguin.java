package ObjectOrientedProgramAssignment.Animal;

public class Penguin implements AquaticAnimals {
    @Override
    public void feed() {
        System.out.println("Penguin likes the fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin makes a lot of sound when they are on land");

    }

    @Override
    public void swim() {
        System.out.println("Penguins are good swimmer");

    }
}
