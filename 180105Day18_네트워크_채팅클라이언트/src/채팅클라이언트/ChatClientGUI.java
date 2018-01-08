package ä��Ŭ���̾�Ʈ;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI extends JFrame {
	String inputMessage;
	String outputMessage;
	String nickName = "Ŭ���̾�Ʈ";
	JTextArea textOutput = new JTextArea(7, 20);
	JTextField textInput = new JTextField(20);

	class ChatClient {
		public ChatClient() {
			BufferedReader in = null;
			BufferedReader stin = null;
			BufferedWriter out = null;
			Socket socket = null;
			try {
				socket = new Socket("localhost", 9999);// Ŭ���̾�Ʈ ���ϻ��� localhost�� �����ּ�
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				stin = new BufferedReader(new InputStreamReader(System.in));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				String outputMessage;
				while (true) {
					outputMessage = stin.readLine(); // Ű�����Է�
					if (outputMessage.equals("bye")) {
						out.write(outputMessage); // ������ bye ������
						out.flush();
						break; // ����
					}
					out.write("Ŭ���̾�Ʈ>" + outputMessage + "\n");
					out.flush();
					String inputMessage = in.readLine();
					System.out.println(inputMessage);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
					System.out.println("������ ä���� ������ �߻��߽��ϴ�.");
				}
			}
		}
	}

	public ChatClientGUI() {
		setTitle("ä��Ŭ���̾�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(5, 5));
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
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					outputMessage = j.getText();
					textOutput.append(outputMessage + "\n");
					j.setText("");
				}
			}
		});

		add(textOutput, BorderLayout.CENTER);
		add(textPanel, BorderLayout.SOUTH);
		setVisible(true);
		setSize(400, 300);
		new ChatClient();
	}

	public static void main(String[] args) {
		new ChatClientGUI();
	}

}
