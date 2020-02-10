package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyBoardTest {

	public  static void main(String[] args) {
		
		BufferedReader br = null;
		//r기반스트림 (표준입력, stadin, System.in)
		
		
		//스트림
		try {
			//r기반스트림 (표준입력, stadin, System.in)
			//보조스트림1 byte|byte|byte -> char
			
			InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
			
			
			//보즈스트림 (cfrch
			br=new BufferedReader(isr);
			
			
			String line=null;
			while((line=br.readLine())!=null) {
				if("exit".equals(line)) {
					break;
				}
				
				}
			System.out.println(line);
			
			} catch (UnsupportedEncodingException e) {
			System.out.println("Error"+e);
		} catch(IOException e) {
			System.out.println("Error"+e);
		}
		
		
		
		
	}
}
