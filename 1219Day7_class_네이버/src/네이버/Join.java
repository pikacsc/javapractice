package 네이버;

//회원가입
public class Join {
	//필드영역
	String id;
	String pw;
	String name;
	String gender;
	int bornyear;
	short bornMonth;
	short bornday;
	String email;
	int phone;
	
	
	//메소드(함수) 영역, 동작하는 영역
	// 메소드 작성법
	/*
	 *                     parameter매개변수
	 * 접근제어자 리턴자료형 함수명(자료형 변수명){
	 * 
	 *  return 리턴자료; 리턴자료는 다른 곳에서 쓸수 있음
	 * }
	 * 
	 *                   parameter매개변수 
	 * 접근제어자 void 함수명(자료형 변수명){
	 * 
	 * 리턴하는게 없음
	 * }
	 * 
	 * 
	 * 예시
	 * 
	 * 
	 * 
	 */
	//출력하기 함수
	void 출력하기(Join x) {
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
	
	String 가입하기(String a) {
		System.out.println("매개변수 = "+a);
		System.out.println("가입하기 함수를 사용하셨습니다");
		return a; 
	}
}
