interface Top{}

class SuperClass implements Top{
	void addition (int a, int b) {
		System.out.println("Sum is "+(a+b));
	}
	void subtraction (int a, int b) {
		System.out.println("Difference is "+(a-b));
	}
	void display() {
		System.out.println("Displaying Parent Class");
	}
}

class Inheritance extends SuperClass{
	void multiplication (int a, int b) {
		System.out.println("Product is "+(a*b));
	}
	void display() {
		System.out.println("Displaying Child Class");
	}
	void displaySuper() {
		super.display();
	}
	public static void main(String args[]) {
		SuperClass sc = new SuperClass();
		Inheritance subclass = new Inheritance();
		subclass.addition(10, 5);
		subclass.subtraction(10, 5);
		subclass.multiplication(10, 5);
		subclass.display();
		subclass.displaySuper();
		System.out.println("Object subclass is a SuperClass: "+(subclass instanceof SuperClass));
		System.out.println("Object sc is a Top: "+(sc instanceof Top));
		System.out.println("Object subclass is a Top: "+(subclass instanceof Top));
	}
}