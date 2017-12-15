package second;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
//		1.세개의 정수를 배열로 입력받아서 큰수를 출력하시오.
//		2.세개의 정수를 배열로 입력받아서 작은수를 출력하시오.
//		[출처] 자바 5일차 중급 문제 (NCS자바프로그래밍&게임프로그래밍) |작성자 헤이즐넛
//

		Scanner sc = new Scanner(System.in);
		int numb[] = new int[3];
		int maxResult;
		int miniResult;
		
		System.out.print("세개의 숫자를 띄어쓰기를 사용하여 한번에 입력하시오 ex)90 80 100 :");
		numb[0] = sc.nextInt();
		numb[1] = sc.nextInt();
		numb[2] = sc.nextInt();
		
		maxResult = numb[0] < numb[1] ?  numb[1] < numb[2] ? numb[2] : numb[1] : numb[0] < numb[2]? numb[2] : numb[0] ;  
		miniResult = numb[0] > numb[1] ?  numb[1] > numb[2] ? numb[2] : numb[1] : numb[0] > numb[2]? numb[2] : numb[0] ;  
		
		System.out.println("큰수는 "+maxResult);
		System.out.println("작은수는 "+miniResult);
		
	}

}
