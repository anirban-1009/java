//Working with files


import java.io.File;

public class ex76 {
	public static void main(String[ ] args) {
		File x = new File("C:\\Users\\anirb\\Desktop\\java\\test.txt");

		if(x.exists()){
			System.out.println(x.getName() + " exists!");
		}
		else {
			System.out.println("The file does not exists");
		}
	}
}