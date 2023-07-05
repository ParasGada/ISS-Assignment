import java.util.*;

class ListDemo{
  public static void main(String args[]){
    
	//Creating ArrayList of string type
    ArrayList<String> arrList = new ArrayList<>();
    arrList.add("Cricket");
    arrList.add("Hockey");
    arrList.add(0, "BasketBall");
    System.out.println("ArrayList Elements: ");
    for(String str:arrList)
      System.out.println(str);
    
    //Creating LinkedList of string type
    LinkedList<String> linkList = new LinkedList<>();
    linkList.add("Apple");
    linkList.add("Orange");
    linkList.add(0, "Banana");
    System.out.println("LinkedList elements: ");
    Iterator<String> it=linkList.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    
    //Creating a Vector of string type
    Vector<String> v = new Vector<>();
    v.add("item1");
    v.add("item2");
    v.add("item3");
    v.remove("item2");
    System.out.println("Vector Elements: ");
    Iterator<String> i = v.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    
    //Creating Stack of string type
    Stack<String> stack = new Stack<>();
    stack.push("Chaitanya");
    stack.push("Ajeet");
    stack.push("Hari");
    stack.pop();
    stack.push("Steve");
    stack.push("Carl");
    stack.pop();
    System.out.println("Stack elements: ");
    for(String str: stack){
      System.out.println(str);
    }
  }
}