//Sorting lists

import java.util.ArrayList;
import java.util.Collections;

public class ex72 {
	public static void main (String[] args){
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("cat");
		animals.add("snake");
		animals.add("dog");

		Collections.sort(animals);

		System.out.println(animals);
	}
}