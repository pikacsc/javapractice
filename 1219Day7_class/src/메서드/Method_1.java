package 메서드;

import java.util.Scanner;

class test{
	void helloWorld(int x) {
		System.out.printf("%d번이 입력됐습니다 \n",x);
		switch(x) {
		case 0:
			System.out.println("난 HelloWorld 함수다");;
		}
	}
	
	void hello(String x) {
		System.out.printf("%s 이입력됐습니다\n",x);
		
	}
	
	int hello_2(int x) {
		return x += 2;
	}
}


public class Method_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner intSc = new Scanner(System.in);
		// void 함수명(){
		//   작업할 코드
		//}
		String input;
		int i;
		test t = new test();
		
		t.helloWorld(0);
		
		System.out.print("아무거나 입력해보세요");
		input = sc.nextLine();
		t.hello(input);
		
		
		System.out.print("아무 숫자나 입력해보세요:");
		i = intSc.nextInt();
		System.out.printf("메소드에서 리턴된 값 %d" ,t.hello_2(i));
		
	}

}
