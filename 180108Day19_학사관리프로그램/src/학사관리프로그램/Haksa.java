package �л�������α׷�;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Haksa extends JFrame {
	JPanel panel;

	Haksa() {
		setTitle("�л�����ý���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar bar = new JMenuBar();

		JMenu m_student = new JMenu("�л�����"); // �޴�
		bar.add(m_student);
		JMenu m_book = new JMenu("��������"); // 2��° �޴�
		bar.add(m_book);

		JMenuItem mi_list = new JMenuItem("�л�����");
		m_student.add(mi_list);

		JMenuItem mi_bookRent = new JMenuItem("������Ȳ");
		m_book.add(mi_bookRent);

		mi_list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); // ��� ������Ʈ ����
				panel.revalidate(); // �ٽ�Ȱ��ȭ
				panel.repaint(); // �ٽ� �׸���
				panel.add(new Student()); // �л������� ���� ȭ���� ������ Ŭ������ ����
				panel.setLayout(null); // ���̾ƿ� ���� ����
			}
		});

		// ������Ȳ������ �̺�Ʈ ó��
		mi_bookRent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll(); // ��� ������Ʈ ����
				panel.revalidate(); // �ٽ�Ȱ��ȭ
				panel.repaint(); // �ٽ� �׸���
		//panel.add(new Book()); // �л������� ���� ȭ���� ������ Ŭ������ ����
				panel.setLayout(null); // ���̾ƿ� ���� ����
			}
		});

		panel = new JPanel();
		add(panel);

		setJMenuBar(bar);
		setSize(800, 600);
		setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Haksa();

	}

}
