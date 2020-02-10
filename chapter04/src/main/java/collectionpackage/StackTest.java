package collectionpackage;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack< String> s = new Stack<String>();
		
		s.push("둘리");
		s.push("마이콜");
		s.push("또치");
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());;
		}
	}

}
