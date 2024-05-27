package OOP_Automobile;

public class Car extends Automobile {
    private int numDoors;
    private double maxSpeed;

    public Car(String color, double currentSpeed, int numDoors, double maxSpeed) {
        super(color, currentSpeed);
        this.numDoors = 0;
        this.maxSpeed = 0.0;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void accelerate(float power) {
        if (getCurrentSpeed() + 10 <= maxSpeed) {
            setCurrentSpeed(getCurrentSpeed() + 10);
        } else {
            setCurrentSpeed(maxSpeed);
        }
    }

    @Override
    public void brake(float power) {
        if (getCurrentSpeed() - 10 >= 0) {
            setCurrentSpeed(getCurrentSpeed() - 10);
        } else {
            setCurrentSpeed(0);
        }
    }
}

