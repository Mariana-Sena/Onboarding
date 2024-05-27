package ZooSystem;

public class Elephant implements Animal {
    private int tuskLength;

    public Elephant(int tuskLength) {
        this.setTuskLength(tuskLength);
    }

    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet!");
    }

	public int getTuskLength() {
		return tuskLength;
	}

	public void setTuskLength(int tuskLength) {
		this.tuskLength = tuskLength;
	}
}

