package OOP_Automobile;

public class Motorcycle<EngineType> extends Automobile {
	
    private EngineType engineType;

    public Motorcycle(String color, double currentSpeed, EngineType engineType) {
        super(color, currentSpeed);
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public void accelerate(float power) {
        setCurrentSpeed(getCurrentSpeed() + 15);
    }

    @Override
    public void brake(float power) {
        if (getCurrentSpeed() - 15 >= 0) {
            setCurrentSpeed(getCurrentSpeed() - 15);
        } else {
            setCurrentSpeed(0);
        }
    }

}