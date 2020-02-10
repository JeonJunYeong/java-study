package chapter04;

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass myClass = MyClass.getInstance();
		MyClass myClass2 = MyClass.getInstance();
	
		System.out.println(myClass==myClass2);
	
	}

}
