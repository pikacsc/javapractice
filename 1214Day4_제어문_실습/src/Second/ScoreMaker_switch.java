package Second;

import java.util.Scanner;

public class ScoreMaker_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 국어;
		int 영어;
		int 수학;
		String l= "학생의 등급은";
		
		System.out.println("국어 영어 수학 점수를 차례대로 띄어쓰기를 이용하여 입력하시오");
		System.out.println("국어 영어 수학 : ");
		국어 = sc.nextInt();
		영어 = sc.nextInt();
		수학 = sc.nextInt();
		
		int score = (국어+영어+수학)/3;
		String result = 90<=score && 100 >= score? "A": 
			            80<=score && 90 >   score? "B":
			            70<=score && 80 >   score? "C":
			            60<=score && 70 >   score? "D":"F";   
		switch(result) {
			case "A":
				 System.out.println(l+" A");
				 break;
			case "B":
				 System.out.println(l+" B");
				 break;
			case "C":
				 System.out.println(l+" C");
				 break;
			case "D":
				 System.out.println(l+" D");
			default:
				 System.out.println(l+" F");
				 break;
		}
	}

}
