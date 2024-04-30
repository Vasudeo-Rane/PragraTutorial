package ObjectOrientedProgramAssignment;

public class MainInherit {
    public static void main(String[] args) {
        Car car = new Car();
        car.getNumDoors();
        car.setNumDoors(2);
        System.out.println(car.getNumDoors());

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.setSpeed(120);

        Car electricType = new ElectricCar();

        ElectricCar electricCar = (ElectricCar) electricType;
        electricCar.setBatteryCapacity("124 KWH");
        System.out.println(electricCar.getBatteryCapacity());

    }
}
