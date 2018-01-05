package 채팅서버;

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
		
		BufferedReader in = null; //네트워크에서 읽어들임
		BufferedReader stin = null; //표준입력
		
		BufferedWriter out = null; //네트워크로 보냄
		ServerSocket listener = null;
		Socket socket = null;

		try {
			listener = new ServerSocket(9999); //서버 소켓 생성
			socket = listener.accept(); //클라이언트 소켓 기다림
			System.out.println("연결됨"); 
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = in.readLine();
				//IgnoreCase 대소문자 구분 안하는 함수
				if(inputMessage.equalsIgnoreCase("bye")){
					//클라이언트가 bye를 보내면 연결 종료
					break;
				}
				
				System.out.println(inputMessage); // 클라이언트가 보낸 메세지 화면에 출력
				String outputMessage = stin.readLine(); //키보드에서 한행의 문자열 읽음
				out.write("서버>"+outputMessage+"\n"); //키보드에서 읽은 문자열 전송
				out.flush(); //문자열 초기화
			}
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
				listener.close();
			}catch(IOException e) {
				System.out.println("클라이언트와 채팅중 오류가 발생 했습니다.");
			}
			
		}
		
		
	}

}
