package ZooSystem;

public class Lion implements Animal {
    private int maneLength;

    public Lion(int maneLength) {
        this.setManeLength(maneLength);
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

	public int getManeLength() {
		return maneLength;
	}

	public void setManeLength(int maneLength) {
		this.maneLength = maneLength;
	}
}

