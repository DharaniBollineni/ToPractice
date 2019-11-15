package mapexcercise;

import java.util.HashMap;
import java.util.Map;

public class BasicMap {

	public BasicMap() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] arg)
	{
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// print hashMap variable
		 System.out.println(hashMap);
		 
		// Add some items
		 hashMap.put(10,"vishal");
		 hashMap.put(11, "Kiran");
		 hashMap.put(12,"Dharani");
		 hashMap.put(12,"Chinmayi");
		 
		 boolean hasX=hashMap.containsKey(12);
		 System.out.println("Check whether key is in the map"+  hasX);
		 
		// Retrieve the value at the key “X” 
		 String xScore = hashMap.get(11); 
		 System.out.println("Retrieve the value at the key 11"+  xScore);
		 
		 System.out.println("one way of printing elements(key and value) in the list");
		 for (Integer c : hashMap.keySet()) { // get key from hashMap list
				System.out.println("The value of letter" + c + " is " + hashMap.get(c)); // get value at c
				
			}
		 
		 System.out.println("2nd way of printing elements(key and value) in the list ");
		 for (Map.Entry<Integer, String> e : hashMap.entrySet()) { 
				System.out.println("The value of letter " + e.getKey() + " is " + e.getValue()); 
				
			} 		 
		 
		
	}

}
