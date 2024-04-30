package ObjectOrientedProgramAssignment;

public class Car extends Vehicle {
    private int numDoors;
    private String typeOfFuel;

    int spareWheels;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getSpareWheels() {
        return spareWheels;
    }

    public void setSpareWheels(int spareWheels) {
        this.spareWheels = spareWheels;
    }

    void usage() {
        System.out.println("Whether for personal or professional use");
    }

    void numberofPassenger() {
        System.out.println("Number of passenger");
    }

}
