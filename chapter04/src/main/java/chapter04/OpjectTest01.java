package chapter04;

public class OpjectTest01 {

	public static void main(String[] args) {
		
		Point p =new Point(10,20);
		
		Class type=p.getClass();
		
		System.out.println(type.getName());//reflection 
		
		
		System.out.println(p.getClass());//클래스 정보
		System.out.println(p.hashCode());  //reference value X, 
									       // address X
										   // address 기반의 해싱값(int)
		System.out.println(p);
		System.out.println(p.toString());  //getClass() +"@" + hashCode()
		
		
		p.toString();
		
		
		
	}

}
