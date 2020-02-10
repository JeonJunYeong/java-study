package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for( int i = 1; i <=100; i++ ) {

			if(i<10)
			{
				if(i%3==0)
				{
					System.out.println(i+" 짝");
				}
			}
			else
			{
				int a=i%10;//몫
				int b=i/10;//나머지
				
				int cnt=0;
				
				if(a%3==0&&a!=0)
					cnt++;
				if(b%3==0&&b!=0)
					cnt++;
				
				if(cnt!=0) {
					System.out.print(i);
					for(int j=0;j<cnt;j++)
						System.out.print("짝");
					System.out.println();
				}
			}
			
		}
	}
}
