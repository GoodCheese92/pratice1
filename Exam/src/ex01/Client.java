package ex01;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/*
1. ������Ʈ : ����/Ŭ���̾�Ʈ ��� ������Ʈ
2. ���ϸ� : Client.java
3. �ۼ��� : �̼���
4. �ۼ��� : 2023-01-12
5. ���� : ������ �����͸� �����ϴ� Ŭ���̾�Ʈ
*/

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 1234));
			Scanner sc = new Scanner(System.in);
			System.out.println("�������� ������ �޽����� �Է��ϼ���>>>");
			String sendMassage = sc.nextLine();
			sc.close();
			byte[] bytes = sendMassage.getBytes("utf-8");
			OutputStream os = socket.getOutputStream();
			os.write(bytes);
			os.flush();
			os.close();
			System.out.println("����(127.0.0.1)�� \""+sendMassage+"\" �����͸� �����߽��ϴ�.");
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
