package first;

import java.util.Scanner;

/*
 * 1. 크기가 10인 배열에 숫자 10개를 저장한 다음 전체 합계를
    출력하시오. for문 사용
2. 1번문제를 향상된 for문으로 출력하시오.
 */

/**
 * 1번 
class InputArray{
	Scanner sc = new Scanner(System.in);
	
	
	void input(int 배열[]) {
		int sum = 0;
		for(int x=0;x<10;x++) {
			System.out.printf("%d번째 숫자를 입력하세요 ",x+1);
			배열[x] = sc.nextInt();
			sum += 배열[x];
		}
		System.out.println();
		System.out.printf("합계는 %d",sum);
	}
	

}
public class SumArray {
	public static void main(String []args) {
		InputArray input = new InputArray();
		int sum =0;
		int []arr = new int[10];
		
		input.input(arr);
		
	}
	
		
}

 */

//2
class InputArray{
	Scanner sc = new Scanner(System.in);
	
	
	void input(int 배열[]) {
		int sum = 0;
		int index = 1;
		for(int x:배열) {
			System.out.printf("%d번째 숫자를 입력하세요 ",index++);
			배열[x] = sc.nextInt();
			sum += 배열[x];
			
		}
		System.out.println();
		System.out.printf("합계는 %d",sum);
	}
	

}
public class SumArray {
	public static void main(String []args) {
		InputArray input = new InputArray();
		int sum =0;
		int []arr = new int[10];
		
		input.input(arr);
		
	}
	
		
}


	

