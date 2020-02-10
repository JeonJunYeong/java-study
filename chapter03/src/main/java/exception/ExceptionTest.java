package exception;



public class ExceptionTest {

	public static void main(String[] args) {
		int a=10;
		int b=11-a;
		
		int result=0;
		
		try {
			System.out.println("code1");
			result=(1+2+3)/b;
			System.out.println("code2");
		}
		catch(ArithmeticException e) {
			//1.사과 
			
			System.out.println("미안합니다.....");
			
			System.out.println(e);
			
			
			return;
		}
		finally {
			System.out.println("code4");
		}
		
		System.out.println("code5");
	}

}
