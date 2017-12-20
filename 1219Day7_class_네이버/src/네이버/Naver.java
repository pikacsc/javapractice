package 네이버;

import java.util.Scanner;

public class Naver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Naver nav = new Naver();
		System.out.println("네이버에 오신것을 환영합니다.");
	
		
		Join member = new Join();
//		
//		System.out.print("이름을 입력하세요:");
//		member.name = sc.nextLine();
//		
//		System.out.print("이메일을 입력하세요:");
//		member.email = sc.nextLine();
//		
//		System.out.print("성별을 입력하세요:");
//		member.gender = sc.next();
//		
//		System.out.print("생년 월 일 띄어쓰기를 사용하여 한번에 입력하세요:");
//		member.bornyear = sc.nextInt();
//		member.bornMonth = sc.nextShort();
//		member.bornday = sc.nextShort();
//		
//		System.out.print("휴대폰 번호를 입력하세요:");
//		member.phone = sc.nextInt();
//		
//		System.out.println("비밀번호를 입력하세요:");
//		member.pw = sc.next();
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		member.출력하기(member);
		String a = member.가입하기("펜을 던졌습니다");
		System.out.println("a");
	}
	    
	
	
	

}
