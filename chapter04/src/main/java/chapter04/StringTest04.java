package chapter04;

public class StringTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aBcABCabcAbc";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abcd",3));
		System.out.println(s.indexOf("abc",7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,5));
		
		String s2="     a b  c  d";
		
		String s3="defghiklnmopa1rst";
		String s4=s2.concat(s3);
		
		System.out.println(s4);
		System.out.println(s2.trim());
		
		
		new StringBuffer("Hello").append("world").append("java");
		
		//주의 + 문자열 연산
		String str2="";
		StringBuffer sb=new StringBuffer("");
		for(int i=0;i<100;i++)
		{
//			str2+=i;
			sb.append(i);
		}
		
		//format
		String name="둘리";
		int score=100;
		
		System.out.println(name+"님의 점수는"+score);
		String.format("%s님의 점수는 %d점입니다",name,score);
		
		
		
		
		
		
		
		
	}

}
