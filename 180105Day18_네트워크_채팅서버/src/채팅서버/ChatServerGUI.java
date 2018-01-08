package ä�ü���;

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
	String nickName = "����";
	JTextArea textOutput = new JTextArea(7,20);
	JTextField textInput = new JTextField(20);

	
	class ChatServer {
		public ChatServer() {
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
	
	

	
	
	public ChatServerGUI() {
		setTitle("ä�ü���");
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
