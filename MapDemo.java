import java.util.*;

public class MapDemo{

	public static void main(String args[]){
		
		//Creating HashMap of string type
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Chaitanya");
		hmap.put(105, "Derick");
		hmap.put(111, "Logan");
		hmap.put(120, "Paul");
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		System.out.println("HashMap Elements:");
		while(iterator.hasNext()) {
			Map.Entry m = (Map.Entry)iterator.next();
			System.out.print("Key is: "+ m.getKey() + " & Value is: ");
			System.out.println(m.getValue());
		}
		
		//Creating TreeMap of string type
		TreeMap<Integer, String> tmap = new TreeMap<>();
	    tmap.put(101, "Anil");
	    tmap.put(105, "David");
	    tmap.put(111, "Load");
	    tmap.put(120, "Paul");
	    Set tset = tmap.entrySet();
	    Iterator it = tset.iterator();
		System.out.println("TreeMap Elements:");
	    while(it.hasNext()) {
	      Map.Entry m = (Map.Entry)it.next();
	      System.out.print("Key is: "+ m.getKey() + " & Value is: ");
	      System.out.println(m.getValue());
	    }
	    
		//Creating LinkedHashMap of string type
	    LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
	    lmap.put(200, "Chaitanya");
	    lmap.put(220, "Paul");
	    lmap.put(245, "Derick");
	    lmap.put(451, "Logan");
	    Set lset = lmap.entrySet();
	    Iterator i = lset.iterator();
		System.out.println("LinkedHashMap Elements:");
	    while(i.hasNext()) {
	      Map.Entry m = (Map.Entry)i.next();
	      System.out.print("Key is: "+ m.getKey() + " & Value is: ");
	      System.out.println(m.getValue());
	    }
	}
}