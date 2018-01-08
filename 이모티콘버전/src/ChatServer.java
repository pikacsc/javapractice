import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ChatServer extends JFrame implements ActionListener {
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	JTextField serverMessage;
	
	JTextField NickName;
	JComboBox  IconBox;
	JPanel panel;
	JScrollPane spane;
	//Receiver clientMessage;
	Receiver    clientMessage;
	String []strIcon = {"noIcon","Icon1","Icon2","Icon3"};
	ArrayList<String> strAr = new ArrayList();
	
	public ChatServer() {
		setTitle("서버 채팅 창"); // 프레임 타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 종료 버튼(X)을 클릭하면 프로그램 종료
		setLayout(new BorderLayout()); //BorderLayout 배치관리자의 사용
		clientMessage = new Receiver(); // 클라이언트에서 받은 메시지를 출력할 컴퍼넌트
		//clientMessage.setEditable(false); // 편집 불가
		Thread t = new Thread(clientMessage); // 클라이언트에서 메시지 수신을 위한 스레드 생성
		NickName = new JTextField(6);
		IconBox = new JComboBox(strIcon);
		
		panel = new JPanel(new FlowLayout());
		serverMessage = new JTextField(20);
		//텍스트 필드에서는 엔터를 쳐도 액션이벤트 발생
		serverMessage.addActionListener(this);
		//spane = new JScrollPane(clientMessage); // 긴 텍스트를 위해  ScrollPane에서 표시
		spane = new JScrollPane(clientMessage, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel.add(NickName);
		panel.add(serverMessage);
		panel.add(IconBox);
		add(spane,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		setSize(400, 200); // 폭 400 픽셀, 높이 200 픽셀의 크기로 프레임 크기 설정
		setVisible(true); // 프레임이 화면에 나타나도록 설정
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		t.start();
	}
	private void setupConnection() throws IOException {
		listener = new ServerSocket(9999); // 서버 소켓 생성
		socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
		System.out.println("연결됨");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 클라이언트로부터의 입력 스트림
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 클라이언트로의 출력 스트림
	}
	public static void main(String[] args) {
		ChatServer frame = new ChatServer();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	//받는 작업을 쓰레드로 처리
	private class Receiver extends JLabel implements Runnable {
		@Override
		public void run() {
			String inputMessage=null;
			String split[] = null;
			
			while (true) {
				try {
					inputMessage = in.readLine(); // 클라이언트에서 한 행의 문자열 읽음
					split = inputMessage.split("-");
					
					if(split.length<3)
					{
						inputMessage = split[0]+split[1];
					}
					else
					{
						inputMessage = split[0]+split[1]+".jpg"+split[2];
						clientMessage.setIcon(new ImageIcon("images/"+split[1]+".jpg"));
					}
					
					
				} catch (IOException e) {
					handleError(e.getMessage());
				} 
				
				strAr.add(inputMessage);
				String ms="";
				for(int i =0; i<strAr.size(); i++)
				{
					 ms += "\n"+strAr.get(i) ;
					clientMessage.setText( ms);
				}
				
				
			
				//clientMessage.append();
				int pos = clientMessage.getText().length();
				//clientMessage.setCaretPosition(pos); // caret 포지션을 가장 마지막으로 이동
			
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == serverMessage) {
			int Index = IconBox.getSelectedIndex();
			String IconName = IconBox.getItemAt(Index).toString();
			String outputMessage = "";
			if(IconName.equals("noIcon"))
			{
				outputMessage = NickName.getText()+ ">"+"-"+serverMessage.getText(); // 텍스트 필드에서 문자열 얻어옴
				
			}			
			else
			{
				outputMessage = NickName.getText()+ ">"+"-"+ IconName+"-"+serverMessage.getText(); // 텍스트 필드에서 문자열 얻어옴
			}
		
			
			
			
			try {
				out.write( outputMessage+"\n"); // 문자열 전송
				out.flush();
				//clientMessage.append("\n" + outputMessage);
				clientMessage.setText("\n" + outputMessage);
				int pos = clientMessage.getText().length();
				//clientMessage.setCaretPosition(pos); // caret 포지션을 가장 마지막으로 이동
				serverMessage.setText(null); // 입력창의 문자열 지움
			} catch (IOException e1) {
				handleError(e1.getMessage());
			} 
		}
	}
}
