package ������;

class Person{
	String name;
	int age;
	
	
	
	//�⺻�����ڴ� �ڱ�Ŭ�����̸��� �޼ҵ�(�Լ�)��, ����������, ����Ÿ���� ǥ�þ��ص���,
	//���� ����־ ������ 
	//��Ʒ�ó�� �ʱ�ȭ��ų�� ���̱⵵��
	Person(){
		name = "ȫ�浿";
		age = 24;
	}
	
	
}


public class PersonExample {

	public static void main(String[] args) {
		  Person2 p = new Person2();    //�����ڴ� new Person()�� �Է��԰� ���ÿ� ���۵� �Ϲ� �޼ҵ����� �ٸ��� ��ü.�޼ҵ��̸�() ������� ���۾���
		  
		  System.out.println(p.name);
		  System.out.println(p.age);
		  
		  Person2 p2 = new Person2("����",25);
		
		  System.out.println(p2.name);
		  System.out.println(p2.age);
		  
	}

}
