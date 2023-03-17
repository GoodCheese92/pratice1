package ex01;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 1. 프로젝트 : 서버/클라이언트 통신 프로젝트
 2. 파일명 : Server.java
 3. 작성자 : 이성진
 4. 작성일 : 2023-01-12
 5. 설명 : 클라이언트가 보낸 데이터를 수신하는 서버
 */

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 1234));
			while(true) {
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				InputStream is = socket.getInputStream();
				byte[] bytes = new byte[100];
				int readByteCount = is.read(bytes);
				String readMessage = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("클라이언트(" + isa.getHostName() + ")로 부터 \"" + readMessage + "\" 데이터를 받았습니다.");
				is.close();
				socket.close();
				
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	} // end of main
} // end of class
