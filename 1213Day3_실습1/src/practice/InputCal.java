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
		
		System.out.print("첫번째 숫자 a 입력:"); //println : 출력한뒤 개행, print : 출력만하고 개행은 하지 않음
		a = sc.nextInt();
		System.out.print("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a+b="+(a+b));
		
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(j);
		
		System.out.print("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.print("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a-b="+(a-b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(k);
		
		System.out.print("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.print("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a*b="+(a*b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(l);
		
		System.out.print("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.print("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a/b="+(a/b));
		
        a = 0; 
        b = 0;
		
		System.out.println("");

		System.out.println("");

		System.out.println("");

		System.out.println("");
		
		System.out.println(m);
		
		System.out.print("첫번째 숫자 a 입력:");
		a = sc.nextInt();
		System.out.print("두번째 숫자 b 입력:");
		b = sc.nextInt();
		System.out.println("a%b="+(a%b));
		




	String id, pw, gender, hobby, email;
	String age;
	String birth; 
	
	/*
	 * **추가로 배운 내용 , 중요함
	 * 
	 * Casting 가능한 data type들
	 * byte<short<int<long<float<double
	 * char
	 * 
	 * 
	 * 
	 * String 은 클래스, 참조변수 이므로 Casting이 안됨
	 * Integer.parseInt(String) 을 사용해서 형변환 해야됨
	 * 
	 */
	
	
	System.out.println("");
	System.out.println("");
	System.out.println("");
	System.out.println("탑크리에듀 회원가입");
	System.out.print("ID를 입력하세요:");
	id = joinSc.nextLine();
	
	
	System.out.print("패스워드를 입력하세요:");
	pw = joinSc.nextLine();
	
	System.out.print("성별을 입력하세요:");
	gender = joinSc.nextLine();
	
	System.out.print("취미를 입력하세요:");
    hobby = joinSc.nextLine();
	
    
	System.out.print("주민번호 앞자리를 입력하세요 또는 생년월일,숫자만 입력할것 ex) 920X0X: ");
	birth = joinSc.nextLine();
	int ageNumb = Integer.parseInt(birth);
	
	System.out.print("나이를 입력하세요:");
	age = joinSc.nextLine();
	int birthNumb = Integer.parseInt(age);
	
	System.out.print("이메일을 입력하세요:");
	email = joinSc.nextLine();
	
	
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
	System.out.println("생년월일 : "+birthNumb);
	System.out.println("나이 : "+ageNumb+"세");

	
	int x = 8;
	int y = 3;
	     
	int result = x++ + --y - ++x + --x + y++; 
//	x++ == 8 첫번째 라인에선 8
//	--y == 2    
//	++x == 9  
//	--x == 7  
//	y++ == 3 첫번째 라인에선 3  
	
/*  
 * 정답: x++,x-- 후위연산자는 첫번째 라인에서 출력할때 x부터  출력되고 x++ +2  이면 첫번째 라인에서는 x+2와 같다 두번째 라인에서는 x+1+2 와 같다
 * 또는 변수가 x++ + --y - ++x 처럼 세번째 항에 한번더 등장할때 x의 값은 앞에서 +1이 된채로(9가됨) ++이 연산되서 8 + 2 - 10 ==0 이된다
 * 	--x + y++ 는 x의 값이 9인 상태에서 -1 == 8이되고  y++ 은 3+1(+1은 다음항에서 y가 나올때) 고로 3  , 8+3==11이 최종답이된다
 * 
 *  또는 위와같은 result 의 경우
 *    
 *    x++  
 *  + --y 
 *  - ++x  
 *  + --x 
 *  + y++;
 *  
 *  처럼  봐야한다
 */
	
	
	
	
	
	System.out.println(result);
	//답은 :8+2-9+7+3=11
	}

}
