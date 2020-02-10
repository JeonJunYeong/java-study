package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileTestReaderTest {

	
	public static void main(String[] args) {
		Reader in = null;
		FileInputStream is = null;
		
		 try {
			 in = new FileReader("test.txt");
			 
			 int count=0;
			 int data=-1;
			 while((data=in.read())!=-1) {
				 System.out.print((char)data);
				 count++;
			 }
			 System.out.println("");
			 System.out.println("count:"+count);
			 System.out.println("========================================");
			 
			 count =0 ;
			 data = -1;
			 is=new FileInputStream("test.txt");
			 
			 while((data=is.read())!=-1) {
				 System.out.print((char)data);
				 count++;
			 }
			 System.out.println("");
			 System.out.println("count:"+count);
			 System.out.println("========================================");
		 }catch(FileNotFoundException e){
			 System.out.println("파일이 없습니다."+e);
		 }catch(IOException e) {
			 System.out.println("에러"+e);
		 }finally {
			 try {
				 if(in!=null)
					 in.close();
				 if(is!=null)
					 is.close();
			 }
			 catch(Exception e) {
				 
			 }
		 }
	}
	
}
