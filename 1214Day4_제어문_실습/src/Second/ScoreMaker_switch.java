package Second;

import java.util.Scanner;

public class ScoreMaker_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ����;
		int ����;
		int ����;
		String l= "�л��� �����";
		
		System.out.println("���� ���� ���� ������ ���ʴ�� ���⸦ �̿��Ͽ� �Է��Ͻÿ�");
		System.out.println("���� ���� ���� : ");
		���� = sc.nextInt();
		���� = sc.nextInt();
		���� = sc.nextInt();
		
		int score = (����+����+����)/3;
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
