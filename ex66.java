// implementing the runnable interface

class Loader implements Runnable {
	public void run() {
		System.out.println("Hello!");
	}
}

class ex66 {
	public static void main(String[] args) {
		Thread t = new Thread(new Loader());
		t.start();
	}
}