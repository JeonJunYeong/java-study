package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br=null;
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
			
			
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr= new InputStreamReader(fis,"UTF-8");
		
			//보조스트림(라인단위 입
			br=new BufferedReader(isr);
			
			String line= null;
			while((line = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(line,"\t ");
				int index=0; 
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					if(index==0) {
						System.out.print(token+":");
					}else if(index ==1){
						System.out.print( token+"-");
					}else if(index ==2){
						System.out.print( token+"-");
					}else {
						System.out.println( token);
					}
					
					index++;
				}
		
			}
			
			
			
		}
		catch(IOException e) {
			System.out.println("error:"+e);
		} 
		finally {
			try {
				if(br!=null) {
					br.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}

}
