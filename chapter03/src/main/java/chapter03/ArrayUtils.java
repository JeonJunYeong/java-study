package chapter03;

public class ArrayUtils {

	
	public static double[] intToDouble(int[] src) {
		
		double[] result=null;
		
		if(src==null)
		{
			return result;
		}
		
		int len=src.length;
		result = new double[len];
		
		
		for(int i=0;i<len; i++) {
			result[i]=src[i];
		}
		
		
		return result;
	}
	
	
}
