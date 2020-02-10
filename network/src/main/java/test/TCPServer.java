package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		
		
		try {
			//1. 서버소켓 생성
			serverSocket = new ServerSocket();
			
			
			serverSocket.setReuseAddress(true);
			
			//2. 바인딩(Socket Address(IP Address + Port) Binding)
			serverSocket.bind(new InetSocketAddress("127.0.0.1",5000));
			
			
				//3. accept
				Socket socket=serverSocket.accept(); //block
				InetSocketAddress remoteInetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				
				InetAddress remoteinetAddress=remoteInetSocketAddress.getAddress();
				
				
				String remoteHostAddress = remoteinetAddress.getHostAddress();
				int remotePort=remoteInetSocketAddress.getPort();
			try {
				//4. IOStream 받아오기 
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				while(true) {
					//5. 데이터 읽기 
					byte[] buffer = new byte[256];
					
					int readByteCount = is.read(buffer);
					
					if(readByteCount==-1) {
						//remote 정상종료  close 호출
						System.out.println("close by client");
						break;
					}
					String data = new String(buffer, 0,readByteCount,"UTF-8") ;
					
					try {
						if("exit".equals(data)&&!socket.isClosed())
							socket.close();
						
					}catch(IOException e){
						System.out.println("exit");
					}
					
					
					System.out.println("[server]received:"+data);
					
					//6. 데이터 쓰기
					os.write(data.getBytes("UTF-8"));
					
					
			}
				
			}catch(SocketException e) {
				System.out.println("[server] sudden close");
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
			
			System.out.println("connected by client["+remoteinetAddress+":"+remotePort+"]");
				
				
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				
				if(serverSocket!=null && !serverSocket.isClosed())
				serverSocket.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}




//internet address = ip address java -> inetaddress ipaddress 
//socket address -> internetaddress(ip address) + port
//inet socketaddress ( inetaddress + port number)