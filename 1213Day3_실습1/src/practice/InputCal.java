/*
 * 1.숫자를 두개 입력 받고 
두수를 더한 값을 출력하세요.  
2.숫자를 두개 입력 받고 
두수를 뺀 값을 출력하세요.
3.숫자를 두개 입력 받고 
두수를 곱한 값을 출력하세요.
4.숫자를 두개 입력 받고 
두수를 나눈 값을 출력하세요.
5.숫자를 두개 입력 받고 
두수를 나머지 값을 출력하세요.


6.탑크리에듀 회원가입 프로그램 만들기
ID : 
PW : 
성별 : 
취미 : 
생일 :
나이 : 
이메일 :
을 입력받고 출력하세요.


7. 다음에 나오는 결과를 설명하세요.
int x = 8;
int y = 3;
int result = x++ + --y - ++x + --x + y++;

System.out.println(result);
[출처] 3일차 문제 첫번째 (NCS자바프로그래밍&게임프로그래밍) |작성자 헤이즐넛
 * 
 * 
 * 
 * 
 */
package practice;

import java.util.Scanner;


public class InputCal {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner joinSc = new Scanner(System.in);
		
		int a, b = 0;
		 String i ="1.숫자를 두개 입력 받고 두수를 더한 값을 출력하세요.";  
		 String j ="2.숫자를 두개 입력 받고 두수를 뺀 값을 출력하세요.";
		 String k ="3.숫자를 두개 입력 받고 두수를 곱한 값을 출력하세요.";
		 String l ="4.숫자를 두개 입력 받고 두수를 나눈 값을 출력하세요.";
		 String m ="5.숫자를 두개 입력 받고 두수를 나머지 값을 출력하세요.";
		
		System.out.println("1.숫자를 두개 입력 받고 \r\n" + 
				"두수를 더한 값을 출력하세요. ");
		
		System.out.println("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.println("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a+b="+(a+b));
		
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(j);
		
		System.out.println("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.println("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a-b="+(a-b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(k);
		
		System.out.println("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.println("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a*b="+(a*b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(l);
		
		System.out.println("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.println("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a/b="+(a/b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(m);
		
		System.out.println("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.println("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a%b="+(a%b));
		




	String id, pw, gender, hobby, email;
	int age;
	int birth; 
	
	System.out.println("탑크리에듀 회원가입");
	System.out.println("ID를 입력하세요:");
	id = joinSc.nextLine();
	
	
	System.out.println("패스워드를 입력하세요:");
	pw = joinSc.nextLine();
	
	System.out.println("성별을 입력하세요:");
	gender = joinSc.nextLine();
	
	System.out.println("취미를 입력하세요:");
    hobby = joinSc.nextLine();
	
    System.out.println("이메일을 입력하세요:");
	email = joinSc.nextLine();
	
	System.out.println("주민번호 앞자리를 입력하세요 또는 생년월일,숫자만 입력할것 ex) 920X0X: ");
	birth = joinSc.nextInt();
	
	System.out.println("나이를 입력하세요:");
	age = joinSc.nextInt();
	
	
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("가입을 축하합니다!!");
	System.out.println("");
	System.out.println("ID : "+id);
	System.out.println("패스워드 : "+pw);
	System.out.println("성별 : "+gender);
	System.out.println("취미 : "+hobby);
	System.out.println("email : "+email);
	System.out.println("생년월일 : "+birth);
	System.out.println("나이 : "+age+"세");

	
	int x = 8;
	int y = 3;
	
	int result = x++ + --y - ++ x + --x + y++; 
//	x++ == 8 첫번째 라인에선 8
//	--y == 2    
//	++x == 9  
//	--x == 7  
//	y++ == 3 첫번째 라인에선 3  
	
	System.out.println(result);
	//답은 :8+2-9+7+3=11
	}

}
