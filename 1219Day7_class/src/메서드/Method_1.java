package �޼���;

import java.util.Scanner;

class test{
	void helloWorld(int x) {
		System.out.printf("%d���� �Էµƽ��ϴ� \n",x);
		switch(x) {
		case 0:
			System.out.println("�� HelloWorld �Լ���");;
		}
	}
	
	void hello(String x) {
		System.out.printf("%s ���Էµƽ��ϴ�\n",x);
		
	}
	
	int hello_2(int x) {
		return x += 2;
	}
}


public class Method_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner intSc = new Scanner(System.in);
		// void �Լ���(){
		//   �۾��� �ڵ�
		//}
		String input;
		int i;
		test t = new test();
		
		t.helloWorld(0);
		
		System.out.print("�ƹ��ų� �Է��غ�����");
		input = sc.nextLine();
		t.hello(input);
		
		
		System.out.print("�ƹ� ���ڳ� �Է��غ�����:");
		i = intSc.nextInt();
		System.out.printf("�޼ҵ忡�� ���ϵ� �� %d" ,t.hello_2(i));
		
	}

}
