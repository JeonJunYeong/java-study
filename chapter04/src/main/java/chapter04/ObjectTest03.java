package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		
		String s1=new String("abc");
		String s2=new String("abc");
		
		
		System.out.println(s1 ==s2);//동일성
		
		System.out.println(s1.equals(s2));//동질성
		System.out.println(s1.hashCode()+":"+s2.hashCode());//내용기반 
		System.out.println(System.identityHashCode(s1)+":"+System.identityHashCode(s2));//주소 기반 
		
		System.out.println("=================================================================================");
		
		String s3="ABC";
		String s4="ABC";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode()+":"+s4.hashCode());
		System.out.println(System.identityHashCode(s3)+":"+System.identityHashCode(s4));
		
		
		
		//s3 와 s4 동일성 동질성 모두 일치  string constant pool string,integer 불변객체 
		
		//string s="Abc
		
		
		
		
	}

}
