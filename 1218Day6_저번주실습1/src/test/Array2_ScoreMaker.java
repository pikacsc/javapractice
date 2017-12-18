package test;

import java.util.Scanner;

public class Array2_ScoreMaker {

	public static void main(String[] args) {
		//2. 국어, 영어, 수학 점수를 배열로 입력받아서 평균을 소수점 2자리 까지 구해서 출력하시오.
		int student[] = new int[3];
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 : ");
		student[0] = input.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		student[1] = input.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		student[2] = input.nextInt();
		
		float fAvg = (float)(student[0]+student[1]+student[1])/student.length;
		
		System.out.printf("평균 : %.2f", fAvg);
		
	}

}
