package chapter03;

public class Goods2 {

	private String name; // 모두 접근 가능 (접근 제한이 없음) 
	private int price; // 같은패키지 + 자식 젒근 가능  
	private int coundSold;  //같은 패키지 안에서만 접근이 가능 
	private int countStock; //한 클래스 
	
	public Goods2() {
		
	}
	public Goods2(String name,int price, int countSold, int countStock) {
		this.name=name;
		this.price=price;
		this.coundSold=coundSold;
		this.countStock=countStock;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCoundSold() {
		return coundSold;
	}
	public void setCoundSold(int coundSold) {
		this.coundSold = coundSold;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	
}
