package ObjectOrientedProgramAssignment;

public class MotorCycle extends Vehicle {
    private int speed;
    private int mileage;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    void stunt() {
        System.out.println("Whether the vehicle can be use for stunt");
    }

    void ofRoadonRoad() {
        System.out.println("Can this run on offroad or onroad");
    }

}
