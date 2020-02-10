package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123456";
		int i =Integer.parseInt(s);
		
		String s2=String.valueOf(i);
		
		
		System.out.println(s+":"+s2);
		
		int a= Character.getNumericValue('A');
		System.out.println(a);
		
		String s3=Integer.toBinaryString(15);
		
		String s4=Integer.toHexString(255);
				System.out.println();
		
	}

}
