package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.Dog;
import util.DogComparator;

public class Main {

	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("Nova", "German Shepard", 10));
		dogList.add(new Dog("Sheeba", "German Shepard", 5));
		dogList.add(new Dog("Woola", "German Shepard", 8));
		dogList.add(new Dog("Chandi", "German Shepard", 14));
		dogList.add(new Dog("Seera", "German Shepard", 6));
		dogList.add(new Dog("Tommy", "German Shepard", 5));

		System.out.println("Before sort \n");
		System.out.println(dogList);

		System.out.println("After sort \n");
		Collections.sort(dogList,new DogComparator());
		System.out.println(dogList);

	}

}
