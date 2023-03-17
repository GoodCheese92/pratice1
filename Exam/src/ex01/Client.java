package ex01;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/*
1. 프로젝트 : 서버/클라이언트 통신 프로젝트
2. 파일명 : Client.java
3. 작성자 : 이성진
4. 작성일 : 2023-01-12
5. 설명 : 서버로 데이터를 전송하는 클라이언트
*/

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 1234));
			Scanner sc = new Scanner(System.in);
			System.out.println("서버에게 전송할 메시지를 입력하세요>>>");
			String sendMassage = sc.nextLine();
			sc.close();
			byte[] bytes = sendMassage.getBytes("utf-8");
			OutputStream os = socket.getOutputStream();
			os.write(bytes);
			os.flush();
			os.close();
			System.out.println("서버(127.0.0.1)로 \""+sendMassage+"\" 데이터를 전송했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(!socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	} // end of main
} // end of class
