package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num=(int)(Math.random()*100+1);
		
		int cnt=1;
		System.out.println("1-100");
		while(true) {
			System.out.println(cnt+">>");
			int now=scan.nextInt();
			
			if(now>num) {
				System.out.println("더 낮게");
			}
			else if(now<num) {
				System.out.println("더 높게");
			}
			else if(now==num)
			{
				System.out.println("정답입니다.");
				break;
			}
		}
		
	}
}
