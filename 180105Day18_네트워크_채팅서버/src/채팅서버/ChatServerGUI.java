package 채팅서버;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServerGUI extends JFrame {
	String inputMessage;
	String outputMessage;
	String nickName = "서버";
	JTextArea textOutput = new JTextArea(7,20);
	JTextField textInput = new JTextField(20);

	
	class ChatServer {
		public ChatServer() {
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
	
	

	
	
	public ChatServerGUI() {
		setTitle("채팅서버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5,5));
		textOutput.setEditable(false);

		
		JLabel nameLabel = new JLabel(nickName);
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new FlowLayout());
		textPanel.add(nameLabel);
		textPanel.add(textInput);
	
		textInput.addKeyListener(new KeyAdapter() {
			JTextField j = textInput;
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_ENTER) {
					outputMessage = j.getText();
					textOutput.append(outputMessage+"\n");
					j.setText("");
					
					
				}
			}
		});
		
		add(textOutput,BorderLayout.CENTER);
		add(textPanel,BorderLayout.SOUTH);
		setVisible(true);
		setSize(400, 300);
		new ChatServer();
	}
	
	
	
	public static void main(String[] args) {
		new ChatServerGUI();
		
	}

}
