import java.util.Formatter;

public class ex78 {
	public static void main(String[ ] args){
		try{
			Formatter f = new Formatter("C:\\Users\\anirb\\Desktop\\java\\ex78-test.txt");
		}catch (Exception e){
			System.out.println("Error");
		}
	}
}