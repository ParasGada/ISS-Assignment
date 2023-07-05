//Creating a class with private variables and public methods accessible to other classes
class Encap{
	private int age;
	
	public void setAge(int age) {
		this.age = age; 
	}
	
	public int getAge() {
		return this.age;
	}
}


class Encapsulation{
	public static void main(String args[]) {
		Encap e = new Encap();
		e.setAge(35);
		System.out.println(e.getAge());
	}
}