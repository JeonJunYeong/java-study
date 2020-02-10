package prob01;

public class Printer{

//	public void println(int n)
//	{
//		System.out.println(n);
//	}
//	
//	public void println(boolean bool)
//	{
//		System.out.println(bool);
//	}
//	
//	public void println(double n)
//	{
//		System.out.println(n);
//	}
//	
//	public void println(String str)
//	{
//		System.out.println(str);
//	}
//	public void println(int a,int b, int c,int d, int e, String str, StringBuffer strbuffer)
//	{
//		System.out.println(a+","+
//							b+","+
//							c+","+
//							d+","+
//							e+","+
//							str+","+
//							strbuffer);
//	}
	
//	public <T> void println(T t)
//	{
//		System.out.println(t);
//	}
//	
	public int sum(int...nums) {
		int sum=0;
		
		for(int n: nums) {
			sum+=n;
		}
		
		return sum;
		
	}
	public <T> void println(T...ts) {
		for(T t:ts) {
			System.out.println(t);
		}
	}
}
