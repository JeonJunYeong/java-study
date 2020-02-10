package collectionpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap<>();
		
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		int i=map.get("one");
		int j=map.get(new String("one"));
		System.out.println(i+":"+j);
		
		
		map.put("three", 3333);
		System.out.println(map.get("three"));
		
		
		
		
		Set<String> s= map.keySet();
		for(String key:s) {
			int value=map.get(key);
			System.out.println(value);
		}
		
	}

}
