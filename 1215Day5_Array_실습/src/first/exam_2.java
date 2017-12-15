package first;

import java.util.Scanner;

public class exam_2 {

	public static void main(String[] args) {
		//		2. 국어 , 영어, 수학 점수를 배열로 입력받아서 평균을 소수점2자리까지 구해서 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		int []score = new int[3];
		float average;
		int arraylen = score.length;
		
		System.out.print("국어 영어 수학 점수를 입력하시오: ");
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		int sum = score[0]+score[1]+score[2];
		
		
		
		average = sum/arraylen;
		
		System.out.printf("평균은 [%.2f] 입니다 ", average);
	}

}
