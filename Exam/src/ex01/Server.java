package ex01;

import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 1. ������Ʈ : ����/Ŭ���̾�Ʈ ��� ������Ʈ
 2. ���ϸ� : Server.java
 3. �ۼ��� : �̼���
 4. �ۼ��� : 2023-01-12
 5. ���� : Ŭ���̾�Ʈ�� ���� �����͸� �����ϴ� ����
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
				System.out.println("Ŭ���̾�Ʈ(" + isa.getHostName() + ")�� ���� \"" + readMessage + "\" �����͸� �޾ҽ��ϴ�.");
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
