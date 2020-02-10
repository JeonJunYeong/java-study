package http;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;

public class RequestHandler extends Thread {
	private Socket socket;
	private static final String DOCUMENT_ROOT="./webapp";
	
	public RequestHandler( Socket socket ) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			// get IOStream
			

			// logging Remote Host IP Address & Port
			InetSocketAddress inetSocketAddress = ( InetSocketAddress )socket.getRemoteSocketAddress();
			consoleLog( "connected from " + inetSocketAddress.getAddress().getHostAddress() + ":" + inetSocketAddress.getPort() );
					
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			OutputStream outputStream = socket.getOutputStream();
			String request = null;
			
			
			while(true){
				String line = br.readLine();
				
					//브라우저가 연결을 끊음
					if(line ==null) {
						break;
					}
					
					//Request(요청)의 헤더만 읽음
					if("".equals(line)) {
						break;
					}
					//Header의 첫번째 라인만 읽음
					if(request == null) {
						request = line;
					}
					
			}
			
			String[] token = request.split(" ");
			
			if("GET".equals(token[0])) {
				
				consoleLog(request);
				responseStaticResuource(outputStream, token[1], token[2]) ;
			}else {//[POST,DELETE,PUT],    HEAD,CONNECT
				
				error(outputStream, "/error/400.html", "400 Bad Request", token[2]);
			}
			
			
	
		} catch( Exception ex ) {
			consoleLog( "error:" + ex );
		} finally {
			// clean-up
			try{
				if( socket != null && socket.isClosed() == false ) {
					socket.close();
				}
				
			} catch( IOException ex ) {
				consoleLog( "error:" + ex );
			}
		}			
	}

	public void consoleLog( String message ) {
		System.out.println( "[RequestHandler#" + getId() + "] " + message );
	}

	private void responseStaticResuource(OutputStream os,String uri,String protocol) throws IOException {
		if("/".equals(uri)) {
			uri= "/index.html";
			
		}
		
		File file = new File(DOCUMENT_ROOT+uri);
		
		if(!file.exists()){
			
			error(os, "/error/404.html", "404 Not Found", protocol);
			return; 
			
		}
		
		//nio new io 
		byte[] body =Files.readAllBytes(file.toPath());
		String contentType = Files.probeContentType(file.toPath());
		//응답
		
		os.write( "HTTP/1.1 200 OK\r\n".getBytes( "UTF-8" ) );
		os.write( ("Content-Type:"+contentType+"; charset=utf-8\r\n").getBytes( "UTF-8" ) );
		os.write( "\r\n".getBytes() );
		os.write( body);
		
		
	}
	
	
	
	private void error(OutputStream os,String route,String error,String protocol) throws IOException {
		
		File file=new File(DOCUMENT_ROOT+route);
		
		byte[] body = Files.readAllBytes(file.toPath());
		String contentType = Files.probeContentType(file.toPath());
		
		os.write( (protocol+error+"\\r\\n").getBytes( "UTF-8" ) );
		os.write( ("Content-Type:"+contentType+"; charset=utf-8\r\n").getBytes( "UTF-8" ) );
		os.write( "\r\n".getBytes() );
		os.write(body);
	}



}
