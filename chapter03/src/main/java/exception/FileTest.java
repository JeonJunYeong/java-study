package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static void main(String[] args) {
		
		InputStream is =null;
		
		try {
			is=new FileInputStream("./hello.txt");
			int data=is.read();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}catch(IOException e){
			e.printStackTrace();
			return;
			
		}
		finally {
			try {
				if(is!=null)
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}