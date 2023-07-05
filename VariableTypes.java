class VariableTypes{
	
	//Creation of instance variable
	private int age;
	
	//Creation of static / class variable
	private static int days;
	
	void setAge(int a) {
		age = a;
	}
	
	void getData() {
		System.out.println("Age is = "+age);
		System.out.println("Days is = "+days);
	}
	
	public static void main(String args[]) {
		
		//Creation of local variable
		int months = 5;
		
		VariableTypes temp = new VariableTypes();
		temp.setAge(50);
		VariableTypes.days = 1000;
		temp.getData();
		
		VariableTypes temp2 = new VariableTypes();
		temp2.setAge(23);
		temp2.getData();
		
		System.out.println("Months is = "+months);
	}
}