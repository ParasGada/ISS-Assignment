abstract class  Animals{
	abstract void makeSound();
}

class Cat extends Animals{
	void makeSound() {
		System.out.println("Cat meows");
	}
}

class Abstraction{
	public static void main(String args[]) {
		
		//Abstract class reference variable to the sub class object
		Animals a = new Cat();
		
		//Sub class reference variable to the same class object
		Cat c = new Cat();
		
		a.makeSound();
		c.makeSound();
		
	}
}