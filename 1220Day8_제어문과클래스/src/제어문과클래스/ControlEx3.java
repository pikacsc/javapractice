package 제어문과클래스;

import java.util.Scanner;

class PrivateNumb{
	
	void gender(String regNo,char gender) {
		
		gender = regNo.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호 입니다.");
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
		
		System.out.println("당신의 주민번호를 입력하세요. (012223-4413456)>");
		regNo = sc.nextLine();
		
		pn.gender(regNo, gender);
	}

}
