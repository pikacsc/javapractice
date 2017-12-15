package first;

import java.util.Scanner;

public class exam_4 {

	public static void main(String[] args) {
//		4. 회원정보를 문자열 배열로 입력받고 출력해보세요.
//		   이름,주소,직업,나이
		Scanner sc = new Scanner(System.in);
		String input;
		String []array = new String[4];
		
		System.out.print("이름을 입력하세요:");
		input = sc.nextLine();
		array[0] = input;
		
		System.out.print("주소를 입력하세요:");
		input = sc.nextLine();
		array[1] = input;
		
		System.out.print("직업을 입력하세요:");
		input = sc.nextLine();
		array[2] = input;
		
		System.out.print("나이를 입력하세요:");
		input = sc.nextLine();
		array[3] = input;
		
		System.out.println("이름:"+array[0]);
		System.out.println("주소:"+array[1]);
		System.out.println("직업:"+array[2]);
		System.out.println("나이:"+array[3]);
					
			
		
	}

}
