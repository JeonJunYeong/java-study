package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		int result=0;
		switch(operation) {
			
			case "+":
				result = new Add().calculate(a, b);
				break;
			case "-":
				result = new Sub().calculate(a, b);
				break;
			case "*":
				result =new Mul().calculate(a, b);
				break;
			case "/":
				result =new Div().calculate(a, b);
				break;
		}
		
		System.out.println(result);
		
	}
}
