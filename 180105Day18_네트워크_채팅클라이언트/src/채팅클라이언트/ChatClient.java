package 채팅클라이언트;

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
			socket = new Socket("localhost",9999);// 클라이언트 소켓생성 localhost는 내컴주소
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String outputMessage;
			while(true) {
				outputMessage = stin.readLine(); //키보드입력
				if(outputMessage.equals("bye")) {
					out.write(outputMessage); // 서버로 bye 보내고 
					out.flush();
					break; // 종료
				}
				out.write("클라이언트>"+outputMessage+"\n");
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
				System.out.println("서버와 채팅중 오류가 발생했습니다.");
			}
		}
	}

}
