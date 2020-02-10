package chapter04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		int count=list.size();
		
		for(int i=0;i<count;i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
