package �����Ŭ����;

import java.util.Scanner;

class PrivateNumb{
	
	void gender(String regNo,char gender) {
		
		gender = regNo.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ �Դϴ�.");
			break;
		}
		
	}
	
}



public class ControlEx3 {

	public static void main(String[] args) {
		char gender = 0;
		Scanner sc = new Scanner(System.in);
		PrivateNumb pn = new PrivateNumb();
		String regNo = "";
		
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���. (012223-4413456)>");
		regNo = sc.nextLine();
		
		pn.gender(regNo, gender);
	}

}
