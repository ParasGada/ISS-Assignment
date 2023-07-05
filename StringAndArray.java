class StringAndArray{
	public static void main(String[] args) {

		//Exploring string class
		System.out.println("Exploring String class");
		char[] myArray = {'h','e','l','l','o'};
		String myString1 = new String(myArray);
		System.out.println(myString1);
		int len = myString1.length();
		System.out.println("Lenght of myString is "+len);
		String myString2 = " world!";
		myString1 = myString1.concat(myString2);
		System.out.println(myString1);

		//Exploring arrays
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		double total = 0;
		for (int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println("Total is " + total);
		double max = myList[0];
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) max = myList[i];
		}
		System.out.println("Max is " + max); 

	}
}