package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferTest {

	public static void main(String args[])  {
		
		BufferedOutputStream bos=null;
		
		try {
			//기반 스트림(소스에 연결)
			FileOutputStream fis= new FileOutputStream("test.txt");
			
			
			//보조 스트림(기반스트름 또는 보조스트름에 연결)
			bos = new BufferedOutputStream(fis);		
			
			for(int i='a'; i<='z';i++) {
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 열수 없습니다.-"+e);
		}catch(IOException e){
			System.out.println("err : "+ e);
		}
		
		finally {
			try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
