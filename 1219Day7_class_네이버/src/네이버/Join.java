package ���̹�;

//ȸ������
public class Join {
	//�ʵ念��
	String id;
	String pw;
	String name;
	String gender;
	int bornyear;
	short bornMonth;
	short bornday;
	String email;
	int phone;
	
	
	//�޼ҵ�(�Լ�) ����, �����ϴ� ����
	// �޼ҵ� �ۼ���
	/*
	 *                     parameter�Ű�����
	 * ���������� �����ڷ��� �Լ���(�ڷ��� ������){
	 * 
	 *  return �����ڷ�; �����ڷ�� �ٸ� ������ ���� ����
	 * }
	 * 
	 *                   parameter�Ű����� 
	 * ���������� void �Լ���(�ڷ��� ������){
	 * 
	 * �����ϴ°� ����
	 * }
	 * 
	 * 
	 * ����
	 * 
	 * 
	 * 
	 */
	//����ϱ� �Լ�
	void ����ϱ�(Join x) {
		System.out.printf("�̸��� %s�Դϴ�. \n",x.name);
		System.out.printf("%d�� %d�� %d�ϻ� �Դϴ� \n",x.bornyear,x.bornMonth,x.bornday);
		System.out.printf("�ڵ��� ��ȣ�� 0%d \n",x.phone);
		if(x.gender.equals("����")) {
			System.out.print("������ �����Դϴ�.");
		}else {
			System.out.print("������ �����Դϴ�.");
		}
		System.out.printf("�н������ %s \n",x.pw);
	}
	
	String �����ϱ�(String a) {
		System.out.println("�Ű����� = "+a);
		System.out.println("�����ϱ� �Լ��� ����ϼ̽��ϴ�");
		return a; 
	}
}
