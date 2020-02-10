package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods= new Goods();
		goods.name="nikon";
		goods.coundSold=100;
		//goods.countStock=50; 
		goods.price=100000;
		
		
		Goods goods2= new Goods();
		Goods goods3= new Goods();
		
		System.out.println(goods.countOfGoods);
	
	}

}
