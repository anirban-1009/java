//method overriding

class Animal {
	public void makeSound(){
		System.out.println("Grr...");
	}
}

class Cat extends Animal{
	public void makeSound(){
		System.out.println("Meow");
	}
}

class ex52 {
	public static void main(String[] args){
		Cat c = new Cat();
		c.makeSound();
	}
}