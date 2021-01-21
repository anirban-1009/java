//Reading File

import java.io.File;
import java.util.Scanner;


public class ex77 {
	public static void main (String[] args) {

		try{
			File x = new File("C:\\Users\\anirb\\Desktop\\java\\Iterators.txt");

			Scanner sc = new Scanner(x);
			while(sc.hasNext()){
				System.out.println(sc.next());

			}
			sc.close();
		}catch(Exception e){
			System.out.println("Error");
		}
	}
}