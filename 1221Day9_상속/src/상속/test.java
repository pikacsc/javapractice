package ���;

public class test {

	public static void main(String[] args) {
		Person p = new Person();
		p.name ="ȫ�浿";
		p.age = 25;
		p.weight = 75.0f;
		System.out.println("�θ�Ŭ���� Person");
		System.out.println(p.eat());
		System.out.println(p.sleep());	
		System.out.println();
		
		Student stdt = new Student();
		stdt.name = "�ּ���";
		stdt.age = 26;
		stdt.weight = 65.0f;
		System.out.println("Person�� ��ӹ��� Student Ŭ����");
		System.out.println(stdt.eat());
		System.out.println(stdt.sleep());
		System.out.println(stdt.study());
		
	}

}
