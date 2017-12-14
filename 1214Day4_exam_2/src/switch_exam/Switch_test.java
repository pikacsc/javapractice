package switch_exam;

import java.util.Scanner;

public class Switch_test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
//		switch (/* 정수, 문자열*/) {
//		case 0:
//			//처리할 명령 문장
//			break; //switch 문장을 탈출한다
//		
//		case 1:
//			//처리할 명령 문장
//			break;
//			
//		default:
//			//위에서 처리를 못한 나머지 처리할 명령 문장
//			break;
//		}
//		System.out.print("숫자를 입력하세요:");
//		i = sc.nextInt();
//		switch(i*5) {
//		case 0:
//			System.out.println("i값은"+i+"입니다.");
//			break;
//		case 1:
//			System.out.println("i값은"+i+"입니다.");
//			break;
//		case 2:
//			System.out.println("i는 2입니다.");
//			break;
//		case 3:
//			System.out.println("i는 3입니다.");
//			break;
//		case 4:
//			System.out.println("i는 4입니다.");
//			break;
//		case 5:
//			System.out.println("i는 5입니다.");
//			break;
//		default:
//			System.out.println("i는 0~5 사이의 수가 아닙니다. 잘못입력했습니다.");
//			break;
//		}
//		
		
		//java 1.7 이후
//		String day = "";
//		System.out.print("요일을 입력하세요:");
//		day = sc.nextLine();
//		
//		switch(day) {
//		case "일요일":
//			System.out.println("일요일");
//			break;
//		
//		case "월요일":
//			System.out.println("월요일");// break; 를 해주지 않으면 그다음 case의 코드도 실행되버림
//		case "화요일":
//			System.out.println("화요일");
//			break;
//		case "수요일":
//		case "목요일":   //case 묶어주기
//		case "금요일":       
//			System.out.println("수목금 셋중 하나입니다");
//			break;
//		case "토요일":
//			System.out.println("토요일");
//			break;
//		}
		
		String day = "";
		System.out.println("요일을 입력하세요 ex)월요일 :");
		day = sc.nextLine();
		
		if(day.equals("일요일")) { //day =="일요일",왼쪽과 같은 문자열 비교는 ,메모리 영역이 달라서 안정성이 떨어짐(stack,heap), 
			//day.equals("일요일") 가 안정적임 
			System.out.println("sunday");
		}else if(day.equals("월요일")) {
			System.out.println("monday");
		}
		
		
	}

}
