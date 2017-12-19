package 네이버;

import java.util.Scanner;

public class Naver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short menuInput;
		
		Naver nav = new Naver();
		System.out.println("네이버에 오신것을 환영합니다.");
	
		
		Join member = new Join();
		
		System.out.print("이름을 입력하세요:");
		member.name = sc.nextLine();
		
		System.out.print("이메일을 입력하세요:");
		member.email = sc.nextLine();
		
		System.out.print("성별을 입력하세요:");
		member.gender = sc.next();
		
		System.out.print("생년 월 일 띄어쓰기를 사용하여 한번에 입력하세요:");
		member.bornyear = sc.nextInt();
		member.bornMonth = sc.nextShort();
		member.bornday = sc.nextShort();
		
		System.out.print("휴대폰 번호를 입력하세요:");
		member.phone = sc.nextInt();
		
		System.out.println("비밀번호를 입력하세요:");
		member.pw = sc.next();
		
		System.out.println();
		System.out.println();
		System.out.println();
		nav.printData(member);
	}
	
	public void printData(Join x) {
		System.out.printf("이름은 %s입니다. \n",x.name);
		System.out.printf("%d년 %d월 %d일생 입니다 \n",x.bornyear,x.bornMonth,x.bornday);
		System.out.printf("핸드폰 번호는 0%d \n",x.phone);
		if(x.gender.equals("남자")) {
			System.out.print("성별은 남자입니다.");
		}else {
			System.out.print("성별은 여자입니다.");
		}
		System.out.printf("패스워드는 %s \n",x.pw);
		
	}


}
