package �л������÷���;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class StudentComparator implements Comparator<CStudent>{

	@Override
	public int compare(CStudent arg0, CStudent arg1) {
		//����� ū������� 
		return arg0.GetInfo().fAver > arg1.GetInfo().fAver ? -1 :
				(arg0.GetInfo().fAver == arg1.GetInfo().fAver ? 0 :1);
	}
	
}



public class CManager {
	private Vector<CStudent> m_pVec = new Vector<CStudent>();
	
	static int StudentCount =0;
	
	public void Initialize() {
		
	}
	//�Ŵ��� �����ϴ� �Լ�
	public void Progress() {
		int iInput =0;
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1.�߰� 2.���� 3.��� 4.�˻� 5.���� 6.���� 7.���� : ");
			iInput = sin.nextInt();
			
			if(iInput == 7)
			{
				break;
			}
			
			switch(iInput) 
			{
			case 1:
				//�߰��Լ�
				Insert();
				break;
			case 2:
				//�����Լ�
				Delete();
				break;
			case 3:
				//���
				Render();
				break;
			case 4:
				//�˻�
				Search();
				break;
			case 5:
				//����
				Sort();
				break;
			case 6:
				//����
				Modify();
				break;
			}
		}
		
		
		

		
	}
	
	void Insert() {
		
		CStudent s = new CStudent();
		s.Input();
		s.Sum();		
		m_pVec.add(s);
		
		StudentCount++;
		
	}
	
	void Delete() {
		String strFindName = "";
		System.out.print("�˻��� �л��� �̸��� �Է��ϼ��� : ");
		Scanner sin = new Scanner(System.in);
		strFindName = sin.nextLine();
		
		for(int i =0; i<m_pVec.size();i++) 
		{
			CStudent st = m_pVec.get(i);
			if(st.GetInfo().strName.equals(strFindName)) {
				m_pVec.remove(i);
				break;
			}
		}
		
		
	}
	
	void Render() {
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i =0; i<m_pVec.size(); i++) {
			CStudent st = m_pVec.get(i);
			st.Output();
		}
	}
	
	void Search(){
		String strFindName = "";
		System.out.print("�˻��� �л��� �̸��� �Է��ϼ��� : ");
		Scanner sin = new Scanner(System.in);
		strFindName = sin.nextLine();
		
		for(int i =0; i<m_pVec.size();i++) 
		{
			CStudent st = m_pVec.get(i);
			if(st.GetInfo().strName.equals(strFindName)) {
				st.Output();
				break;
			}
		}
	}
	
	void Sort() {
		//��Ʈ
		Collections.sort(m_pVec,new StudentComparator());
		
	}
	void Modify() {
		String strFindName = "";
		System.out.print("�˻��� �л��� �̸��� �Է��ϼ��� : ");
		Scanner sin = new Scanner(System.in);
		strFindName = sin.nextLine();
		
		for(int i =0; i<m_pVec.size();i++) 
		{
			CStudent st = m_pVec.get(i);
			//�л� ã��
			if(st.GetInfo().strName.equals(strFindName)) {
				st.Input();
				st.Sum();
				break;
			}
		}
	}
	
	
	
	
}
