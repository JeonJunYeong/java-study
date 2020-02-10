package chapter04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		int count=list.size();
		
		for(int i=0;i<count;i++)
		{
			System.out.println(list.get(i));
		}

		
		list.remove(1);
		
		//순회2
		Iterator<String> it =list.iterator();
		
		while(it.hasNext()) {
			String now=it.next();
			System.out.println(now);
		}
		
		//순회3
		for(String s : list) {
			System.out.println(s);
		}
		
		
		
		
	}

}
