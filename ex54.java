//abstract

abstract class Animal {
	int leg = 0;
	abstract void makeSound();
}

class Cat extends Animal {
	public void makeSound(){
		System.out.println("Meow");
	}
}

public class ex54{
	public static void main(String[] args){
		Cat c = new Cat();
		c.makeSound();
	}
}