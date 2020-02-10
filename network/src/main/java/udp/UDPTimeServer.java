package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPTimeServer {

	
	private static final int PORT =7000;
	private static final int BUFFER_SIZE =1024;
	
	
	public static void main(String[] args) {

		DatagramSocket socket=	null;
	
		try {
			socket=new DatagramSocket(PORT);
			
			while(true) {
			DatagramPacket receiverPacket = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
			socket.receive(receiverPacket);
			
		
			byte[] data= receiverPacket.getData();
			int length= receiverPacket.getLength();
			String message = new String(data,0,length,"UTF-8");
			
			System.out.println("[server]received"+message);
		
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
			String dateData = format.format(new Date());
			
			
			
			
			byte[] sendData =dateData.getBytes("UTF-8");
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,receiverPacket.getAddress(),receiverPacket.getPort());
			socket.send(sendPacket);
			}
		} catch (SocketException e) {
			
		}catch(IOException e) {
		}
		finally {
			
			
			if(socket!=null != socket.isClosed()) {
				socket.close();
			}
		}

	}
	
	
}
