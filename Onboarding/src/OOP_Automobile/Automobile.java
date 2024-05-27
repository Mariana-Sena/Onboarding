package OOP_Automobile;

public abstract class Automobile {
	
	private String color;
	private double currentSpeed;
	
	public Automobile(String color, double currentSpeed) {
		this.color = "";
		this.currentSpeed = 0.0;
	}
		
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    // Abstract Methods
    public abstract void accelerate(float power);
    public abstract void brake(float power);
}
