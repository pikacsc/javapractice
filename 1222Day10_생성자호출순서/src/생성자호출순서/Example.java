package ������ȣ�����;

class A{
	int age;
	public A() {
		System.out.println("������ A����");
	}
	
	public A(int age) {
		this.age = age;
		System.out.println("������A(age)����"+age);
	}
	
}

class B extends A{
	public B() {
		System.out.println("������ B����");
	}
	
	public B(int age) {
		super(age);
		System.out.println("�����ִ� ������ B����");
	}
}

class C extends B{
	public C() {
		System.out.println("������ C����");
	}
	public C(int age) {
		super(age);
		System.out.println("�����ִ� ������ C����");
	}
}

public class Example {
	public static void main(String[] args) {
		C c = new C(200);
	}
}
