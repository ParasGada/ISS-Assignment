class Animal{
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class Polymorphism{
	public static void main(String args[]) {
		
		//Super class reference variable to the same class object
		Animal a = new Animal();
		
		//Super class reference variable to the sub class object
		Animal d = new Dog();
		
		//Sub class reference variable to the same class object
		Dog dg = new Dog();
		
		a.makeSound();
		d.makeSound();
		dg.makeSound();
		
	}
}