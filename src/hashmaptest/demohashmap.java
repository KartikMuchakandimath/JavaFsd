package hashmaptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demohashmap {
  public static void main(String[] args) {
	Map<String, Integer> map1 = new HashMap<String, Integer>();
	
	map1.put("Jhon", 25);
	map1.put("Max", 29);
	map1.put("Raj", 35);
	System.out.println(map1);
	map1.put("Max", 30);
	System.out.println(map1);
	
	
	System.out.println("jhon is there?: "+map1.containsKey("Jhon"));
	System.out.println("kartik is there?: "+map1.containsKey("kartik"));
	
	System.out.println("all keys: "+map1.keySet());
	System.out.println("all values: "+map1.values());
	
	Set<String> names= map1.keySet();
	for(String name: names)
		System.out.println("name: "+name+", age: "+map1.get(name));
	
	
	}
}
