package sample;

import java.util.*;

public class frameworkseg {

	public static void main(String args[]) {
		
	Set fruit= new HashSet();
		
	fruit.add("apple");
	fruit.add("banana");
	
	System.out.println(fruit.size());
	System.out.println(fruit);
	System.out.println(fruit.contains("banana"));
	System.out.println(fruit.isEmpty());
	System.out.println(fruit.remove("apple"));
	System.out.println(fruit.remove("banana"));
	System.out.println(fruit.isEmpty());
	
	List fruit1 = new ArrayList();
	fruit1.add(0, "banana");
	fruit1.add(1,"apple");
	fruit1.add(2,"berry");
	fruit1.add(3,"cherry");
	
	System.out.println(fruit1);
	System.out.println(fruit1.get(1));
	System.out.println(fruit1.subList(1, 3));
	System.out.println(fruit1.size());
	System.out.println(fruit1.remove(1));
	System.out.println(fruit1);
	
	Queue sports = new LinkedList();
	sports.add("football");
	sports.add("tennis");
	sports.add("cricket");
	
	System.out.println(sports.peek());
	System.out.println(sports.size());
	System.out.println(sports.contains("tennis"));
	
	Map fruitcalories = new HashMap();
	fruitcalories.put("apple", 12);
	fruitcalories.put("cherry", 31);
	fruitcalories.put("berry", 11);
	fruitcalories.put("kiwi", 12);
	
	System.out.println(fruitcalories);
	System.out.println(fruitcalories.get("cherry"));
	System.out.println(fruitcalories.entrySet());
	System.out.println(fruitcalories.keySet());
	System.out.println(fruitcalories.isEmpty());
	System.out.println(fruitcalories.containsKey("berry"));
	
	
	
		
	}
}
