package �������̵�;


//�������̵� override || overriding
// ����Ŭ����(�θ�Ŭ����)�� �޼ҵ带 ����Ŭ�������� ������ �ϴ°�

class Subject{
	String name;
	
	
	void printInfo() {
		System.out.printf("�����: %s \n",name);
	}
	
}

class MajorSubject extends Subject {
	String targetGrader;
	
	void printInfo() {
		super.printInfo();   //superŬ����(�θ�)�� �޼ҵ� ���� super.�޼ҵ�
		System.out.printf("��� �л�: %s \n",targetGrader);
	}
	
	
}


public class SubjectExample {

	public static void main(String[] args) {
		Subject sb = new Subject();
		sb.name = "�ڹ�";
		sb.printInfo();
		
		MajorSubject msb = new MajorSubject();
		msb.targetGrader = "�������̵�";
		msb.printInfo();
		
		//��ĳ����
		Subject ss = new MajorSubject(); //�θ�Ÿ�� ������ ����
		ss.name = "�ڹ�";
		ss.printInfo();
		
		Subject ss2 = new Subject();
		ss2.name = "�ڹ� 1111";
		ss2.printInfo();
		
		MajorSubject  ms = new MajorSubject();
		ms.name = "�ڹ� 2222";
		ms.printInfo();
		  
		//��ĳ����                   �޸𸮿������� �ڽĸ�ŭ�� �з��� �ö�
		Subject sb2 = new MajorSubject(); //�޼ҵ�� �θ�ŭ �����ۿ� ����
		sb.name ="�ڹ�";
		
		//�ٿ�ĳ����
		MajorSubject msb2 = (MajorSubject)sb2; 
		msb2.targetGrader = "dd";
			
	}

}
