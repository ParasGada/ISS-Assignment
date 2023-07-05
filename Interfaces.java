interface Vehicle{
	public void move();
}

interface Car extends Vehicle{}

class Interfaces implements Car{
	
	public void move() {
		System.out.println("Vehicle moves");
	}
	
	public static void main(String args[]) {
		Interfaces i = new Interfaces();
		i.move();
	}
}