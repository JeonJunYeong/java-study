package com.douzone.paint.point;

public class ColorPoint extends Point {

	
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y,String color) {
		super(x,y);
		this.color=color;
	}
	@Override
	public void show() {
		System.out.println("점[x="+getX()+", y="+getY()+", color="+color+"]을 그렸습니다.");
	}
	@Override
	public void show(boolean visible) {
		// TODO Auto-generated method stub
		super.show(visible);
	}
	

}
