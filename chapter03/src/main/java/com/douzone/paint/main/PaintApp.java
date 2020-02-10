package com.douzone.paint.main;

import com.douzone.paint.Interface.Drawable;
import com.douzone.paint.point.ColorPoint;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rect;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.test.GraphicTest;

public class PaintApp {

	public static void main(String[] args) {
		
		Point point1 = new Point(2,5);
		
		drawPoint(point1);
		
		Point point2=new Point(10,50);
		
		//drawPoint(point2);
		draw(point2);
		Point point3=new ColorPoint(50,100,"red");
		//drawPoint(point3);
		
		draw(point3);
		point3.show(false);
		point3.show(true);
		
		
	
		Rect rect=new Rect();
		draw(rect);
		
		Triangle triangle=new Triangle();
		//drawShape(triangle);
		draw(triangle);
		
		Circle circle=new Circle();
		//drawShape(circle);
		draw(circle);
		
		draw(new GraphicTest("hello"));		
		
		//instanceof test
		
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		
		//오류
		//System.out.println(circle instanceof Rect);
		Shape s=new Circle();
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Rect);
		
		
		//Interface 는 hierach 상관없이 instancef
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
		
	
	}
	
	public static void draw(Drawable d) {
		d.draw();
	}
	
	public static void drawShape(Shape now) {
		now.draw();
	}
	
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
	
	

}
