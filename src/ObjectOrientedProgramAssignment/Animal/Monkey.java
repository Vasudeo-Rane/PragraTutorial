package ObjectOrientedProgramAssignment.Animal;

public class Monkey implements Climbable {
    @Override
    public void feed() {
        System.out.println("Lion is eating meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey can make a good sound");
    }

    @Override
    public void climb() {
        System.out.println("Monkey is very good in climbing");

    }
}
