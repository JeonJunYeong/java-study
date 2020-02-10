package mypackage;

public class Goods {

	public String name; // 모두 접근 가능 (접근 제한이 없음) 
	protected int price; // 같은패키지 + 자식 젒근 가능  
	int coundSold;  //같은 패키지 안에서만 접근이 가능 
	private int countStock; //한 클래스 
	
	static int countOfGoods;
	public Goods() {
		Goods.countOfGoods++;
	}
	
	
}
