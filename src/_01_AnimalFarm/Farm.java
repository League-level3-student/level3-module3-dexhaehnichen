package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		Cow cow0 = new Cow();
		Cow cow1 = new Cow();
		Pig pig0 = new Pig();
		Goat goat0 = new Goat();
		Cat cat0 = new Cat();
		Cow cow2 = new Cow();
		ArrayList<animal> farm = new ArrayList<animal>();
		farm.add(cow0);
		farm.add(cow1);
		farm.add(pig0);
		farm.add(goat0);
		farm.add(cat0);
		farm.add(cow2);
		
		
		
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
		
	}
	
}
