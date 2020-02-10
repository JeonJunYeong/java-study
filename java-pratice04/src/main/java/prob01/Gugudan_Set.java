package prob01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Gugudan_Set {

static int resultNumber = 0;
	
	public static void main( String[] args ) {
		int l = randomize( 1, 9 );
		int r = randomize( 1, 9 );
		Set<Integer> answerNumbers;
		resultNumber = l * r;

		int cnt=0;
		
		answerNumbers=randomizeAnswers(resultNumber);
		
		
		System.out.println( l + " x " + r + " = ?" );
		
		Iterator<Integer> it=answerNumbers.iterator();
		
		while(it.hasNext()) {
			
			
			
			if( cnt % 3 == 0 ) {
				System.out.print( "\n" );
			} else {
				System.out.print( "\t" );
			}
			cnt++;
			System.out.print(it.next());
		}
		
		

		System.out.print( "\n\n" );
		System.out.print( "answer:" );

		Scanner s = new Scanner( System.in );
		int now = s.nextInt();
		
		if(now==resultNumber)
			System.out.println("정답");
		else
			System.out.println("오답");
	}

	private static int randomize( int lNum, int rNum ) {
        int random = (int) ( Math.random() * rNum ) + lNum;
        return random;
	}
	
	private static Set<Integer> randomizeAnswers(int resultNum) {

		final int COUNT_ANSWER_NUMBER = 8;
		final int MAX_ANSWER_NUMBER = 81;
		
		Set<Integer> boardNumbers = new HashSet<Integer>();
		int occupied = 0;
		int result_order=(int)(Math.random() *9)+1;
		
		while( occupied < COUNT_ANSWER_NUMBER ) {
			int random = 0;
			if(occupied==result_order)
				boardNumbers.add(resultNum);
			else
				random = ( int )( Math.random() * MAX_ANSWER_NUMBER ) + 1;
	       
	        if(boardNumbers.contains(random))
	        continue;
	        
	        boardNumbers.add(random);
	        occupied++;
	        
		}
		
        return boardNumbers;
	
	
	}
}
