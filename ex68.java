//Linked list

import java.util.LinkedList;

public class ex68 {
	public static void main(String[] args) {
		LinkedList<String> c = new LinkedList<String>();
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		c.add("Orange");
		c.remove("Green");
		System.out.println(c);

	}
}