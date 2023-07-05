import java.util.*;

public class SetDemo{

	public static void main(String args[]){

		//Creating a HashSet of string type
		HashSet<String> set=new HashSet<>();
		set.add("Paul");
		set.add("Ram");
		set.add("Aaron");
		set.add("Ram");
		set.add("Becky");
		Iterator<String> it=set.iterator();
		System.out.println("HashSet Elements: ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//Creating a LinkedHashSet of string type
		LinkedHashSet<String> linkedSet=new LinkedHashSet<>();
	    linkedSet.add("Paul");
	    linkedSet.add("Ram");
	    linkedSet.add("Aaron");
	    linkedSet.add("Leo");
	    linkedSet.add("Becky");
	    Iterator<String> i=linkedSet.iterator();
	    System.out.println("LinkedHastSet Elements: ");
	    while(i.hasNext()){
	      System.out.println(i.next());
	    }
	    
		//Creating a TreeSet of string type
	    TreeSet<String> treeSet=new TreeSet<>();
	    treeSet.add("Paul");
	    treeSet.add("Ram");
	    treeSet.add("Aaron");
	    treeSet.add("Leo");
	    treeSet.add("Becky");
	    Iterator<String> ij=treeSet.iterator();
	    System.out.println("TreeSet Elements: ");
	    while(ij.hasNext()){
	      System.out.println(ij.next());
	    }
	}
}