 // Extend the Thread class

class Loader extends Thread {
	public void run() {
		System.out.println("Hello");
	}
}

class ex65 {
	public static void main(String[] args) {
		Loader obj = new Loader();
		obj.start();
	}
}