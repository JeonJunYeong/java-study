package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		BufferedReader br=null;
		Scanner scan= null;
		
		String sbc="abc";
		StringBuffer a=new StringBuffer("abcd");
		
		
		
		try {
			File file = new File("./src/phone.txt");
			
			if(!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=파일 정보=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length()+"bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-ddd hh:mm:ss").format(new Date(file.lastModified())));
			
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=전화번호=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			scan=new Scanner(file);
			
			while(scan.hasNext()) {
				String name = scan.next();
				String phone1 = scan.next();
				String phone2 = scan.next();
				String phone3 = scan.next();
				
				
				System.out.println(name+":"+phone1+"-"+phone2+"-"+phone3);
			}
			
		}catch(IOException e) {
			System.out.println("error:"+e);
		} 
		finally {
			scan.close();
		}
		
		
		
		
		
		
		
		
		
	}

}
