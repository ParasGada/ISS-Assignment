class LoopControl{

	public static void main(String args[]) {

		//Creating a for loop
		System.out.println("Testing a for loop");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}

		//Creating a enhanced for loop
		System.out.println("Testing a enhanced for loop");
		int integers[] = {100,200,300,400,500};
		for(int a:integers) {
			System.out.println(a);
		}

		//Creating a while loop
		System.out.println("Testing a while loop");
		int x = 10;
		while(x<=15) {
			System.out.println(x);
			x++;
		}

		//Creating a do while loop
		System.out.println("Testing a do while loop");
		int y = 30;
		do {
			System.out.println(y);
			y++;
		}while(y<35);
	}
}