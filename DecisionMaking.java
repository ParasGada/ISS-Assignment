class DecisionMaking{
	public static void main(String args[]) {

		//Creating a conditional operator
		boolean i = true;
		boolean j = false;
		int a = 5;
		int b = 10;
		System.out.println(i?a:b);
		System.out.println(j?a:b);

		//Creating a if statement
		if(10 > 5) {
			System.out.println("10 is greater than 5");
		}

		//Creating an if-else statement
		int m = 100;
		int n = 50;
		if(m < n) {
			System.out.println("100 is less than 50");
		}else {
			System.out.println("100 is greater than 50");
		}

		//Creating a nested if statement
		int x = 30;
		int y = 10;
		if(x == 30) {
			if(y == 10) {
				System.out.println("X = 30 and Y = 10");
			}
		}
		
		//Creating a switch statement
		int marks = 4;
		switch(marks) {
		case 1:
			System.out.println("Lowest");
			break;
		case 2:
			System.out.println("Low");
			break;
		case 3:
			System.out.println("Neutral");
			break;
		case 4:
			System.out.println("High");
			break;
		case 5:
			System.out.println("Highest");
			break;
		default:
			System.out.println("Invalid");
		}

	}
}