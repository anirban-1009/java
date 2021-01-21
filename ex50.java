//inheritance constructors

class A {
	public A(){
		System.out.println("New A");
	}
}

class B extends A{
	public B(){
		System.out.println("New B");
	}
}

class ex50 {
	public static void main(String[] args) {
		B obj = new B();
	}
}