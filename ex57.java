//Anonymous classes

class Machine {
	public void start() {
		System.out.println("Starting....");
	}
}

class ex57 {
	public static void main(String[] args){
		Machine m = new Machine(){
				@Override public void start() {
				System.out.println("Woooooo!");
			}
		};
		m.start();
	}

}