package ä��Ŭ���̾�Ʈ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		Socket socket =null;
		try {
			socket = new Socket("localhost",9999);// Ŭ���̾�Ʈ ���ϻ��� localhost�� �����ּ�
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String outputMessage;
			while(true) {
				outputMessage = stin.readLine(); //Ű�����Է�
				if(outputMessage.equals("bye")) {
					out.write(outputMessage); // ������ bye ������ 
					out.flush();
					break; // ����
				}
				out.write("Ŭ���̾�Ʈ>"+outputMessage+"\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println(inputMessage);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(IOException e) {
				System.out.println("������ ä���� ������ �߻��߽��ϴ�.");
			}
		}
	}

}
