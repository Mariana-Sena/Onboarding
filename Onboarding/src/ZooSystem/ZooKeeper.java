package ZooSystem;

public class ZooKeeper {
	public void feedAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public void performDailyRoutine(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
            animal.sleep();
            animal.eat();
        }
    }
}

