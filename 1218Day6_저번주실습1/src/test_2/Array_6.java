package test_2;

import java.util.Scanner;

public class Array_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Max[] = new int[3];
		System.out.println("숫자를 입력하세요 : ");
		Max[0] = sc.nextInt();
		Max[1] = sc.nextInt();
		Max[2] = sc.nextInt();
		
		
		//Max[0],Max[1],Max[2] 셋중에 큰수를 추려내는 로직
		if(Max[0] > Max[1]) 
		{
		    //Max[0]이 큰경우
			if(Max[0]>Max[2])
			{
				System.out.println("Max[0]이 제일 큽니다."+Max[0]);
			}		
			else {
				System.out.println("Max[2]이 제일 큽니다."+Max[2]);
			}
		}
		else //Max[1]
		{
			if(Max[1] > Max[2])
			{
				System.out.println("Max[1]이 제일 큽니다."+Max[1]);
			}
			else
			{
				System.out.println("Max[2]이 제일 큽니다."+Max[2]);
			}
		}
		
	}

}
