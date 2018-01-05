package ä�ü���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		
		BufferedReader in = null; //��Ʈ��ũ���� �о����
		BufferedReader stin = null; //ǥ���Է�
		
		BufferedWriter out = null; //��Ʈ��ũ�� ����
		ServerSocket listener = null;
		Socket socket = null;

		try {
			listener = new ServerSocket(9999); //���� ���� ����
			socket = listener.accept(); //Ŭ���̾�Ʈ ���� ��ٸ�
			System.out.println("�����"); 
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = in.readLine();
				//IgnoreCase ��ҹ��� ���� ���ϴ� �Լ�
				if(inputMessage.equalsIgnoreCase("bye")){
					//Ŭ���̾�Ʈ�� bye�� ������ ���� ����
					break;
				}
				
				System.out.println(inputMessage); // Ŭ���̾�Ʈ�� ���� �޼��� ȭ�鿡 ���
				String outputMessage = stin.readLine(); //Ű���忡�� ������ ���ڿ� ����
				out.write("����>"+outputMessage+"\n"); //Ű���忡�� ���� ���ڿ� ����
				out.flush(); //���ڿ� �ʱ�ȭ
			}
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
				listener.close();
			}catch(IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä���� ������ �߻� �߽��ϴ�.");
			}
			
		}
		
		
	}

}
