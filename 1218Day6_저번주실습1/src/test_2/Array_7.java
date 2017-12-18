package test_2;

import java.util.Scanner;

public class Array_7 {

	public static void main(String[] args) {
		
		//		3. 문자 배열을 이용해서 'h','e','l','l','o' 를 초기화 하세요.
		 //		 그 후 int형 배열 5개에 숫자를 입력 받습니다.
		 //		 입력은 숫자로 이어서 받습니다.
		 //		 하단처럼 결과가 나올수 있게 알고리즘을 작성합니다.
		 //		  ex)
		 //		숫자다섯개를 입력하세요 : 0 1 2 3 4
		 //		결과 : hello
		 //		숫자다섯개를 입력하세요 : 2 3 0 1 4
		 //		결과 : llheo 
		 //		숫자다섯개를 입력하세요 : 4 3 2 1 1
		 //		결과 : ollee
		char str[] = {'h','e','l','l','o'}; //문자배열 초기화
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 다섯개를 입력하세요 0~4 까지만 :");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		              //문자열화 시키기 , 문자열+숫자
		System.out.println(""+str[arr[0]]+str[arr[1]]+str[arr[2]]+str[arr[3]]+str[arr[4]]);
	}

}
