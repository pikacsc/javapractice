package First;

import java.util.Scanner;

public class ScoreMarker_2 {

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
		if(90<=score && 100 >= score) System.out.println(l+" A");
		else if(80<=score && 90 > score) System.out.println(l+" B");
		else if(70<=score && 80 > score) System.out.println(l+" C");
		else if(60<=score && 70 > score) System.out.println(l+" D");
		else System.out.println(l+"F");
		
	}

}
