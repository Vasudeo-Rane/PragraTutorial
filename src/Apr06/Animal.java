package Apr06;

public class Animal {
    String color;
    double height;

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", height=" + height +
                '}';
    }

    Animal() {
        color = "Red";
        height = 9.99;
    }

    public void walk() {
        System.out.println("Animal is walking and his color is " + color);
    }

    public void talk() {
        System.out.println("Animal is talking his height is " + height);
    }

    public void eat() {
        System.out.println("Animal is eating ");
    }

    public void makeSound() {
        System.out.println("Animal is making Sound");
    }
}
