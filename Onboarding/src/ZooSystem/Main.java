package ZooSystem;

public class Main {
	public static void main(String[] args) {

		var aFeatherColor = FeatherColor.BLUE;
		var p1 = Parrot.with(aFeatherColor);
		var featherColor = FeatherColor.RED;
		var p2 = Parrot.with(featherColor);
		
		System.out.println("Parrot 1: ");
		p1.makeSound();

		System.out.println("Parrot 2: ");
		p2.makeSound();
		
		System.out.println("Parrot modifying: ");
		p1.paintFeather(aFeatherColor.YELLOW);
		p1.makeSound();
    }
}



