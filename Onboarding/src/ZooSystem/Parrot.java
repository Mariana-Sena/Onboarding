package ZooSystem;

import java.util.Objects;

public class Parrot implements Animal {
    private String featherColor;

    private Parrot(final String featherColor) {
        this.featherColor = featherColor;
    }
    
    public static Parrot with(final FeatherColor aFeatherColor) {
    	return new Parrot(aFeatherColor.toString());
    }
    
    public void paintFeather(final FeatherColor aColor) {
    	if(Objects.nonNull(aColor)) {
    		featherColor = aColor.toString();
    	}
    }
    
    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void makeSound() {
    if(featherColor == "BLUE") {
    	System.out.println("Pedro");
    } else 
        System.out.println("Squawk!");
    }

	public String getFeatherColor() {
		return featherColor;
	}
}
