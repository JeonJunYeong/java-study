package chapter04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
	Set<String> s = new HashSet<String>();
	
	s.add("둘리");
	s.add("마이콜");
	s.add("또치");
	
	
	System.out.println(s.contains("둘리"));
	System.out.println(s.size());
	
	Iterator<String >it =s.iterator();
	while(it.hasNext())
	{
		String str=it.next();
		System.out.println(str);;
	}
				
		
	}

}
