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
//   ������ Ǯ��		
//		String result = 90<=score && 100 >= score? "A": 
//			            80<=score && 90 >   score? "B":
//			            70<=score && 80 >   score? "C":
//			            60<=score && 70 >   score? "D":"F";   
//		switch(result) {
//			case "A":
//				 System.out.println(l+" A");
//				 break;
//			case "B":
//				 System.out.println(l+" B");
//				 break;
//			case "C":
//				 System.out.println(l+" C");
//				 break;
//			case "D":
//				 System.out.println(l+" D");
//			default:
//				 System.out.println(l+" F");
//				 break;
		
//       �Ǵٸ� ��� ��
		//������ 10���� ������ int ���̱� ������ �Ҽ��� �κ��� ��������, 91,92,93,,,,97  �� 9.1, 9.2, 9.3, 9.7 �� �����ڸ� �� �� 9�̱� ������ 
		//case 10 case 9 ������ 90<=score && 100 >= score? "A" ǥ���� �����ϴ�
		switch(score/10) {
			case 10:
			case  9:
				System.out.println(l+"A");
				break;
			case  8:
				System.out.println(l+"B");
				break;
			case  7:
				System.out.println(l+"C");
				break;
			case  6:
				System.out.println(l+"D");
				break;
			default:
				System.out.println(l+"F");
				break;
		}
		
	}

}
