package mar26;

import java.util.Scanner;

public class SimulatesTrafficLight {
    public static void main(String[] args) {
        System.out.print("Enter the traffic light color :- ");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();

        switch (color.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("prepare to stop");
                break;
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("Traffic light color is incorrectly entered");
                break;
        }
    }
}
