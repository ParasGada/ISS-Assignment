class Super_Class{
	void display() {
		System.out.println("Displaying from Super Class");
	}
}

class Overriding extends Super_Class{
	void display() {
		System.out.println("Displaying from the Child class");
	}
	public static void main(String args[]) {
		Super_Class sc = new Super_Class();
		Super_Class or = new Overriding();
		sc.display();
		or.display();
	}
}