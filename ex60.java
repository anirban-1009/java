//comparing objects 

class Animal {
	String name;
	Animal(String n){
		name = n;
	}
}

class ex60{
	public static void main(String[ ] args) {
		Animal a1 = new Animal("Anirban");
		Animal a2 = new Animal("Anirban");
		System.out.println(a1 == a2);
	}
}