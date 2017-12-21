package 객체배열;

import java.util.Scanner;

class Member{
	String name;
	String address;
	String job;
	int age;
	public void ShowInfo() {
		System.out.printf("이름: %s \n",name);
		System.out.printf("주소: %s \n",address);
		System.out.printf("직업: %s \n",job);
		System.out.printf("나이: %d \n",age);
		System.out.println();
	}
}


public class InstanceArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member MemArr[] = new Member[6]; //6명, Member 객체 배열 6개
		
		for(int i=0;i<MemArr.length;i++) { //i가 돌아가면서 하나씩 생성함
			MemArr[i] = new Member();//객체생성
			System.out.println("이름을 입력하세요: ");
			MemArr[i].name = sc.next();
			System.out.println("주소를 입력하세요: ");
			MemArr[i].address = sc.next();
			System.out.println("직업을 입력하세요: ");
			MemArr[i].job = sc.next();
			System.out.println("나이를 입력하세요: ");
			MemArr[i].age = sc.nextInt();
			System.out.println();
		}
		
		for(int i=0;i<MemArr.length;i++) {
			MemArr[i].ShowInfo();
		}
	}

}
