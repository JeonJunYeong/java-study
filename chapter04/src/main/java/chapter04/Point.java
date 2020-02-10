package chapter04;


public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x="+x+",y="+y+"]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
	
	
}
