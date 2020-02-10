package chapter04;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i= new Integer(10);
		Character c= new Character('c');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);

		
		//AutobOX
		
		Integer j1=10;
		Integer j2=10;
		System.out.println(j1+":"+j2);
		System.out.println(j1==j2);
		System.out.println(i==j1);
		
		//AUTO UNBOAXING
//		int j3=20+i.intValue();
		int j3=20+i;
	}

}
