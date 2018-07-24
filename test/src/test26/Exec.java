package test26;

import java.util.ArrayList;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
		List<Animal> aList = new ArrayList<Animal>();
		aList.add(new Cat("동동이1"));
		aList.add(new Cat("동동이2"));
		aList.add(new Dog("강아지인 동동이1"));
		aList.add(new Dog("강아지인 동동이1"));
		for (Animal n : aList) {
			System.out.println(n);
		}
	}
}
