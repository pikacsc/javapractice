package First;

import java.util.Scanner;

public class ScoreMarker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String l= "�л��� �����";
		System.out.print("�л� ������ �Է��ϼ���:");
		score = sc.nextInt();
		if(90<=score && 100 >= score) System.out.println(l+" A");
		else if(80<=score && 90 > score) System.out.println(l+" B");
		else if(70<=score && 80 > score) System.out.println(l+" C");
		else if(60<=score && 70 > score) System.out.println(l+" D");
		else System.out.println(l+"F");
		
	}

}
