//interfacing

interface Animal {
	public void eat();
	public void makeSound();
}

class Cat implements Animal {
	public void makeSound(){
		System.out.println("Meow");
	}
	public void eat(){
		System.out.println("onmonmonmon");
	}
}

public class ex55 {
	public static void main(String[] args){
		Cat c = new Cat();
		c.eat();
		c.makeSound();
	}
}