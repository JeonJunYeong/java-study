package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print( "수를 입력하세요 : " );
		int num=scanner.nextInt();
		
		int result=0;
		boolean check=true;
		if(num%2==0)
			check=true;//짝
		else
			check=false;//홀
		while (num>0) {
			
			if(check==true) {
				if(num%2==0)
					result+=num;
				num--;
			}
			else {
				if(num%2!=0)
					result+=num;
				num--;
			}
		}
		
		System.out.println("결과 값:"+result);
	} 
}
