package First;

import java.util.Scanner;

public class ScoreMarker_2 {

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
		if(90<=score && 100 >= score) System.out.println(l+" A");
		else if(80<=score && 90 > score) System.out.println(l+" B");
		else if(70<=score && 80 > score) System.out.println(l+" C");
		else if(60<=score && 70 > score) System.out.println(l+" D");
		else System.out.println(l+"F");
		
	}

}
