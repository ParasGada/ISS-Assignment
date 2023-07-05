class ModifierTypes{
	
	//Creating a variable with default access modifier
	static float number = 56.43f;
	
	//Creating a variable with private access modifier 
	private static boolean flag = true;
	
	//Creating a variable with public access modifier and final keyword
	static final double week = 9;
	
	//Creating a variable with protected access modifier and final keyword
	protected static final int box = 42;
	
	public static void main(String args[]) {
		System.out.println(number);
		System.out.println(flag);
		System.out.println(week);
		System.out.println(box);
	}
}