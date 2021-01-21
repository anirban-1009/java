//Inner class

class Robot {
	int id;
	Robot(int i) {
		id = 1;
		Brain b = new Brain();
		b.think();
	}

	private class Brain {
		public void think() {
			System.out.println(id + " is thinking");
		}
	}
}

public class ex59 {
	public static void main(String[] args){
		Robot r = new Robot(1);
	}
}