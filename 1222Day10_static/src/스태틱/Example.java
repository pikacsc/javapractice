package ����ƽ;

class Book{
	String name;
	static int price; 
	static int count;
	Book(){
		count++;
	}
	
	void printInfo() {
		System.out.printf("name : %s \n",name);
		System.out.printf("price : %d \n",price);
		System.out.println();
	}
	
}





public class Example {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		Book b2 = new Book();
		
		
		b1.name = "Java";
		b2.name = "C";
		
		b1.price = 10000;
		b2.price = 15000; //price ������ static�� �տ� �پ��־ ��������
		
		b1.printInfo();
		b2.printInfo();
		
		System.out.printf("����� �Ǿ��� %d \n",b2.count);
		Book.count = 3; //Ŭ�������� static �޸� �κ��� �����ֱ⋚���� �׻� ������
		System.out.println("������ ���� count: "+b2.count);
	}

}
