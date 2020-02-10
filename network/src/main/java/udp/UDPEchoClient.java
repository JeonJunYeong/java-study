package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Scanner;

import javax.sound.midi.Receiver;

public class UDPEchoClient {

	private static final String SERVER_IP="127.0.0.1";
	private static final int SERVER_PORT =  7000;
	private static final int BUFFER_SIZE =1024;
	
	public static void main(String[] args) {
		
		
		Scanner scan= null;
		DatagramSocket socket= null;
		
		
		try {
			
			scan = new Scanner(System.in);
			
			socket = new DatagramSocket();
			
			
			while(true) {
				System.out.print(">>");
				String line = scan.nextLine();
				
				if("quit".equals(line)) {
					break;
				}
				
				
				byte[] sendData = line.getBytes("UTF-8");
				DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,new InetSocketAddress(SERVER_IP,SERVER_PORT));
				socket.send(sendPacket);
				
				DatagramPacket receiverPacket = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
				socket.receive(receiverPacket);

				byte[] data= receiverPacket.getData();
				int length= receiverPacket.getLength();
				String message = new String(data,0,length,"UTF-8");
				
				
				System.out.println("<<"+message);
				
				
				
			}
		
		}catch(IOException e) {
			
		}
		
		
	}
	
}
