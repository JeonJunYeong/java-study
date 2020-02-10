package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		//기반 스트림
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("./src/IO/BufferedReaderTest.java");
			
			br= new BufferedReader(fr);
			
			String line= null;
			while((line= br.readLine())!=null) {
				System.out.println(line);
			}
		
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.-"+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(Exception e) {
				
			}
		}
		
	}

}
