package �ݺ�����Ŭ����;

import java.util.Scanner;

class ScoreDTO{
	String iName = "";
	int iKor = 0;
	int iEng = 0;
	int iMath = 0;
	
}

public class LoopEx {

	public static void main(String[] args) {
		LoopEx main = new LoopEx();
		String []ST = {"student1","student2","student3","student4","student5"};
		
		
		//5���� �л��� �������� �������� ���������� �Է¹ޱ�
		//�迭,�ݺ������� ��ü�����ϱ�
		for(int i =0;i<5;i++) {
			ScoreDTO student[] = new ScoreDTO[i];
			main.inputScore(student[i]);
			main.printScore(student[i]);
		}
		

		
		
		//�ݺ���
		
	}
	void inputScore(ScoreDTO x) {
		Scanner sc = new Scanner(System.in);
			System.out.print("�л��̸� �Է��ϼ��� : ");
			x.iName = sc.nextLine();
			System.out.print("���������� �Է��ϼ��� : ");
			x.iKor = sc.nextInt();
			System.out.print("���������� �Է��ϼ��� : ");
			x.iEng = sc.nextInt();
			System.out.print("���������� �Է��ϼ��� : ");
			x.iMath = sc.nextInt();
			System.out.println();
	}
	void printScore(ScoreDTO x) {
		String �̸� = x.iName;
		int ���� = x.iKor;
		int ���� = x.iEng;
		int ���� = x.iMath;
				
		System.out.printf("�л��̸�: %s \n",�̸�);
		System.out.printf("����: %s \n",����);
		System.out.printf("����: %s \n",����);
		System.out.printf("����: %s \n",����);
		
	}

}
