package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT=5000;
	
	
	
	public static void main(String[] args) {
	
		//1. Scanner 생성(표준입력,키보드 연결)
		Scanner scan = null;
		Socket socket =  null;
		try {
			
			scan = new Scanner(System.in);
			socket=new Socket();
			
			socket.connect(new InetSocketAddress(SERVER_IP,SERVER_PORT));
			log("Connected");
			
			//3. IOStream 생성(받아오기)
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			PrintWriter pw= new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);// true 버퍼가 차지 않아도 즉시 flush 
			
			 
			
			
		while(true) {
			
			//5. 키보드 입력 받기 
			System.out.print(">> ");
			String line = scan.nextLine();
			
			if("quit".equals(line))
				break;
			
			//6.데이터 쓰기
			pw.println(line);
			
			//7.데이터 읽기
			String data=br.readLine();
			
			if(data== null) {
				log("closed by Server");
				break;
			}
			System.out.println("<< "+data);
		}
		
		}catch(IOException e) {
			
		}finally {
			try {
			if(scan!=null)
				scan.close();
			
			if(socket!=null&&!socket.isClosed()) 
				socket.close();
			}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	public static void log(String log) {
		System.out.println("[client]"+ log);
	}	
	
	
}
