//Array list

import java.util.ArrayList;

public class ex67 {
	public static void main(String[ ] args) {
		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.remove("Green");

		System.out.println(colors);
	}
}