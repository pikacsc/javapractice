package �л������÷���;

import java.util.Scanner;

public class CStudent {
	private CInfo m_tStudent;
	Scanner sin = new Scanner(System.in);
	
	CStudent(){
		m_tStudent = new CInfo();
	}
	
	
	//�л������Է�
	public void Input() {
		System.out.print("�̸� �Է� : ");
		m_tStudent.strName = sin.nextLine();
		System.out.print("���� �Է� : ");
		m_tStudent.iKor = Integer.parseInt(sin.nextLine());
		System.out.print("���� �Է� : ");
		m_tStudent.iEng = Integer.parseInt(sin.nextLine());
		System.out.print("���� �Է� : ");
		m_tStudent.iMath = Integer.parseInt(sin.nextLine());
		
	}
	//�л��������
	public void Output() {
		System.out.print(m_tStudent.strName+"\t"+m_tStudent.iKor+"\t"+m_tStudent.iEng);
		System.out.println("\t"+m_tStudent.iMath+"\t"+m_tStudent.iTotal+"\t"+m_tStudent.fAver);
		
	}
	//�հ� �� ��� �����ִ� �Լ�
	public void Sum() {
		m_tStudent.iTotal = m_tStudent.iKor+m_tStudent.iEng+m_tStudent.iMath;
		m_tStudent.fAver  = (float)m_tStudent.iTotal/3.0f;
	}
	
	public CInfo GetInfo() {
		return m_tStudent;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
