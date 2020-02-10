package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT=5000;
	
	public static void main(String[] args) {
		
		
		
		//1.소켓 생성
		Socket socket = null;
		Scanner scan=new Scanner(System.in);
		
		//2.서버연결
		
		try {
			socket=new Socket();
			
			
			
			socket.setTcpNoDelay(true);
			
			socket.setSoTimeout(1000);
			
			int receiveBufferSize = socket.getReceiveBufferSize();
			int sendBufferSize = socket.getSendBufferSize();
			
			System.out.println(receiveBufferSize+":"+sendBufferSize);			
			socket.connect(new InetSocketAddress("127.0.0.1",5000));
			System.out.println("connected");
			
			//3. IOStream 받아오기
			InputStream is= socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			while(true) {
			//4. 쓰기 
			String data = scan.next();
			os.write(data.getBytes("UTF-8"));
			
			
			//5.읽기
			byte[] buffer = new byte[256];
			
			int readByteCount = is.read(buffer);
			
			if(readByteCount==-1) {
				//SERVER 정상종료  close 호출
				System.out.println("close by Server");
			}else {
				data = new String(buffer, 0,readByteCount,"UTF-8") ;
				System.out.println("[client]received:"+data);

			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket !=null && !socket.isClosed())
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	

}
