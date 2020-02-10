package chapter03;

public class StaticMethod {

	int n;
	static int m;
	
	void f1() {
		System.out.println(n);
	}
	
	void f2() {
		System.err.println(StaticMethod.m);
		
		System.out.println(m);
	}
	
	void f3() {
		s1();
		
	}
	
	void f4() {
		f2();
	}
	
	
	static void s1() {
		//static method 에서 인스턴스 변수 접근 안됨
		//System.out.println(n));
		System.out.println(m);
	}
	
	static void s2() {
		System.out.println(m);
	}
	
	static void s3() {
	
		//오류 : static method 에서 인스턴스 메소드 접근은 안된다
		//f1();
	}
	
	static void s4() {
		s1();
	}
	
	
}
