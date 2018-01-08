import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener{
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Receiver serverMessage;
	JTextField clientMessage;
	JTextField NickName;
	JPanel panel;
	JScrollPane spane;
	JComboBox IconBox;
	String [] strIcon = {"noIcon","Icon1","Icon2","Icon3"};
	
	public ChatClient() {
		setTitle("Ŭ���̾�Ʈ ä�� â"); //������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư Ŭ���ϸ� ���α׷�����
		setLayout(new BorderLayout());
		//�������� ���� �޽����� ����� ������Ʈ TextArea��ӹ���Ŭ����
		serverMessage = new Receiver(); 
		
		serverMessage.setEditable(false); //���� �Ұ�
		Thread t = new Thread(serverMessage); //�������� �޼��� ������ ���� ������ ����
		NickName = new JTextField(6);
		IconBox = new JComboBox(strIcon);
		panel = new JPanel(new FlowLayout());
		clientMessage = new JTextField(20);
		clientMessage.addActionListener(this);
		spane = new JScrollPane(serverMessage); //�� �ؽ�Ʈ�� ���� ScrollPane���� ǥ��
		//add(NickName,BorderLayout.SOUTH);
		add(spane,BorderLayout.CENTER);
		panel.add(NickName);
		panel.add(clientMessage);
		panel.add(IconBox);
		add(panel,BorderLayout.SOUTH);
		setSize(400,200);
		setVisible(true);
		try {
			setupConnection();//Ŭ���̾�Ʈ�� ���������ϴ� �Լ�
		}catch(IOException e) {
			handleError(e.getMessage());//������ ���� ����ϴ� �Լ�
		}
		t.start();
		
	}
	
	private void setupConnection() throws IOException{
		socket = new Socket("localhost",9999);
		System.out.println("�����");
		//�����κ��� �޼����� �޴� ��Ʈ��
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
		//������ �޼����� ������ ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
	}
	public static void main(String[] args) {
		ChatClient frame = new ChatClient();

	}
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable{

		@Override
		public void run() {
			String inputMessage = null;
			String split[] = null;
			
			while(true) {
				try {
					inputMessage = in.readLine();//�������� �� ���� ���ڿ��� ����
					split = inputMessage.split("-");
					
					if(split.length<3)
					{
						inputMessage = split[0] + split[1];
					}
					else
					{
						inputMessage = split[0] + split[1] +".jpg"+split[2];
					}
					
				}catch(IOException e) {
					handleError(e.getMessage());
				}
				serverMessage.append("\n" + inputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos);//caret�������� ���� ���������� �̵�
				
			}
			
			
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clientMessage) {
			int Index = IconBox.getSelectedIndex();
			String IconName = IconBox.getItemAt(Index).toString();
			System.out.println(IconName);
			String outputMessage = "";
			
			if(IconName.equals("noIcon"))
			{
				outputMessage = NickName.getText()+">"+"-"+clientMessage.getText();
			}
			else
			{
				outputMessage = NickName.getText()+">"+"-"+IconName+"-"+clientMessage.getText();
			}
			
			try {
				out.write(outputMessage+"\n"); //���ڿ� ����
				out.flush();
				serverMessage.append("\n"+outputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos);//caret�������� ���� ���������� �̵�
				clientMessage.setText(null);//�Է�â�� ���ڿ� ����
				
			}catch(IOException e1) {
				handleError(e1.getMessage());
			}
			
			
		}
		
	}

}
