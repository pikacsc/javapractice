package �����ε�;

class Calculator{
	//�޼ҵ� �����ε�:�Լ��� �ñ״��Ĵ� ���� ����(parameter)�� �ٸ� �Լ��� �����ϴ°�
	//
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
}



public class Overloding {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(20, 30);
		c.add(20, 30, 40);
	}

}
