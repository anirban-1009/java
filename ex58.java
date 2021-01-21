//Anonymous classes - 2

class Machine {
	public void start() {
		System.out.println("Starting....");
	}
}

class ex58 {
	public static void main(String[] args){
		Machine m = new Machine(){
				@Override public void start() {
				System.out.println("Woooooo!");
			}
		};
		Machine m2 = new Machine();
		m2.start();
	}

}