package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServerReceiveThread extends Thread{

	ServerSocket serverSocket;
	Socket socket;

	
	public EchoServerReceiveThread(Socket socket) {
		this.socket=socket;
	}
	
	@Override
	public void run() {
		

	try {
		
		InetSocketAddress remoteInetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
		String remoteHostAddress = remoteInetSocketAddress.getAddress().getHostAddress();
		int remotePort=remoteInetSocketAddress.getPort();
		
		
		log("connected by client["+remoteHostAddress+"]"+remotePort);
		
		
		//4. IOStream 받아오기 
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
		PrintWriter pw= new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);// true 버퍼가 차지 않아도 즉시 flush 
		
		
		
		while(true) {
			//5. 데이터 읽기 
			String data = br.readLine();
			if(data == null) {
				//remote 정상종료  close 호출
				log("close by client");
				break;
			}
			
			
			log("received:"+data);
			
			//6. 데이터 쓰기
			pw.println(data);	
	}
		
	}catch(SocketException e) {
		log("sudden close");
	}catch(IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(socket != null&&!socket.isClosed()) {
				socket.close();
			}					
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	}

	public static void log(String log) {
		System.out.println("[server#"+Thread.currentThread().getId()+"]"+ log);
	}
	
}
