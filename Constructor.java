class Constructor{
	
	int age;
	
	//Creating no argument constructor
	Constructor(){
		age = 45;
	}
	
	//Creating a parameterized constructor
	Constructor(int temp){
		age = temp;
	}
	
	public static void main(String args[]) {
		Constructor demo1 = new Constructor();
		Constructor demo2 = new Constructor(60);
		
		System.out.println("No argument constructor: "+demo1.age);
		System.out.println("Parameterized constructor: "+demo2.age);
	}
}