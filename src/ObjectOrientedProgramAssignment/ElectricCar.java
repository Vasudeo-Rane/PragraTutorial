package ObjectOrientedProgramAssignment;

public class ElectricCar extends Car {
    private String batteryCapacity;

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    void chargeBattery() {
        System.out.println("How much time it takes to charge the battery");
    }
}
