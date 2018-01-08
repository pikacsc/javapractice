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
		setTitle("���� ä�� â"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư(X)�� Ŭ���ϸ� ���α׷� ����
		setLayout(new BorderLayout()); //BorderLayout ��ġ�������� ���
		clientMessage = new Receiver(); // Ŭ���̾�Ʈ���� ���� �޽����� ����� ���۳�Ʈ
		//clientMessage.setEditable(false); // ���� �Ұ�
		Thread t = new Thread(clientMessage); // Ŭ���̾�Ʈ���� �޽��� ������ ���� ������ ����
		NickName = new JTextField(6);
		IconBox = new JComboBox(strIcon);
		
		panel = new JPanel(new FlowLayout());
		serverMessage = new JTextField(20);
		//�ؽ�Ʈ �ʵ忡���� ���͸� �ĵ� �׼��̺�Ʈ �߻�
		serverMessage.addActionListener(this);
		//spane = new JScrollPane(clientMessage); // �� �ؽ�Ʈ�� ����  ScrollPane���� ǥ��
		spane = new JScrollPane(clientMessage, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel.add(NickName);
		panel.add(serverMessage);
		panel.add(IconBox);
		add(spane,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		setSize(400, 200); // �� 400 �ȼ�, ���� 200 �ȼ��� ũ��� ������ ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ��Ÿ������ ����
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		t.start();
	}
	private void setupConnection() throws IOException {
		listener = new ServerSocket(9999); // ���� ���� ����
		socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
		System.out.println("�����");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
	}
	public static void main(String[] args) {
		ChatServer frame = new ChatServer();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	//�޴� �۾��� ������� ó��
	private class Receiver extends JLabel implements Runnable {
		@Override
		public void run() {
			String inputMessage=null;
			String split[] = null;
			
			while (true) {
				try {
					inputMessage = in.readLine(); // Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
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
				//clientMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
			
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
				outputMessage = NickName.getText()+ ">"+"-"+serverMessage.getText(); // �ؽ�Ʈ �ʵ忡�� ���ڿ� ����
				
			}			
			else
			{
				outputMessage = NickName.getText()+ ">"+"-"+ IconName+"-"+serverMessage.getText(); // �ؽ�Ʈ �ʵ忡�� ���ڿ� ����
			}
		
			
			
			
			try {
				out.write( outputMessage+"\n"); // ���ڿ� ����
				out.flush();
				//clientMessage.append("\n" + outputMessage);
				clientMessage.setText("\n" + outputMessage);
				int pos = clientMessage.getText().length();
				//clientMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
				serverMessage.setText(null); // �Է�â�� ���ڿ� ����
			} catch (IOException e1) {
				handleError(e1.getMessage());
			} 
		}
	}
}
