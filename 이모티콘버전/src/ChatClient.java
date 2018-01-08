import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatClient extends JFrame implements ActionListener {
	BufferedReader in = null;
	BufferedWriter out = null;
	Socket socket = null;
	Receiver serverMessage;
	JTextField clientMessage;
	JTextField NickName;
	JPanel panel;
	JScrollPane spane;
	JComboBox  IconBox;
	String []strIcon = {"noIcon","Icon1","Icon2","Icon3"};
	public ChatClient() {
		setTitle("Ŭ���̾�Ʈ ä�� â"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư(X)�� Ŭ���ϸ� ���α׷� ����
		setLayout(new BorderLayout()); //BorderLayout ��ġ�������� ���
		serverMessage = new Receiver(); // �������� ���� �޽����� ����� ���۳�Ʈ
		
		
		serverMessage.setEditable(false); // ���� �Ұ�
		Thread t = new Thread(serverMessage); // �������� �޽��� ������ ���� ������ ����
		NickName = new JTextField(6);
		IconBox = new JComboBox(strIcon);
		panel = new JPanel(new FlowLayout());
		clientMessage = new JTextField(20);
		clientMessage.addActionListener(this);
		spane = new JScrollPane(serverMessage); // �� �ؽ�Ʈ�� ����  ScrollPane���� ǥ��
		add(NickName,BorderLayout.SOUTH);
		add(spane,BorderLayout.CENTER);
		panel.add(NickName);
		panel.add(clientMessage);
		panel.add(IconBox);
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
		socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����
		System.out.println("�����");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
	}
	public static void main(String[] args) {
		ChatClient frame = new ChatClient();
	}

	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable {
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
					}
					
				} catch (IOException e) {
					handleError(e.getMessage());
				} 
				serverMessage.append("\n" + inputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clientMessage) {
			int Index = IconBox.getSelectedIndex();
			String IconName = IconBox.getItemAt(Index).toString();
			System.out.println(IconName);
			String outputMessage ="";
			
			if(IconName.equals("noIcon"))
			{
				 outputMessage = NickName.getText()+ ">"+"-"+clientMessage.getText(); // �ؽ�Ʈ �ʵ忡�� ���ڿ� ����
			}
			else
			{
				 outputMessage = NickName.getText()+ ">" +"-"+ IconName+"-"+clientMessage.getText(); // �ؽ�Ʈ �ʵ忡�� ���ڿ� ����
			}
				
			
			
			try {
				out.write( outputMessage+"\n"); // ���ڿ� ����
				out.flush();
				serverMessage.append("\n" + outputMessage);
				int pos = serverMessage.getText().length();
				serverMessage.setCaretPosition(pos); // caret �������� ���� ���������� �̵�
				clientMessage.setText(null); // �Է�â�� ���ڿ� ����
			} catch (IOException e1) {
				handleError(e1.getMessage());
			} 
		}
	}
}
