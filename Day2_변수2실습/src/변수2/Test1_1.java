package 변수2;
/*
 * 1. JVM을 설명하시오.
Java 파일을 인터프리터 해주고 class 파일로 컴파일 해주는 프로그램, 운영체제에 맞는 고유의 JVM의 존재하여
운영체제에 맞는 JVM만 있으면 어떤 운영체제든 상관없이 Java파일을 실행 시킬수 있음




2. main함수의 public 키워드에 대해 설명하시오.
접근제어자




3. main함수의  static 에 대한 설명을 하시오.
메모리에 항상 상주시킨다는 개념



4. int a = 100; 의 리터럴은 무엇 인가?
100




5. 자바에서 12라는 숫자를 8진수를 표기하는 방법을 설명하시오.
012




6. 1바이트 (-128~127)사이에서 쓰이는 숫자형 자료형은?
byte




7. 아래와 같이 코딩 해보고 왜 결과가 그렇게 되는지 설명하시오.

  String a = 10 + 7 + "";

  String b = 8 + "" + 2; 

  String c = "" + 5 + 2; 

  

  System.out.println(a); 

  System.out.println(b); 

  System.out.println(c); 

 17
 82
 52


 */



public class Test1_1 {

	public static void main(String[] args) {


		  String y = 10 + 7 + "";

		  String k = 8 + "" + 2; 

		  String l = "" + 5 + 2; 

		  

		  System.out.println(y); 

		  System.out.println(k); 

		  System.out.println(l); 

		  byte a = 10;
		  byte b = 30;
		  int c = a*b;
		  

		  float e = 0.101f;
		  float f = 0.899f;
		  

		  System.out.println(c);
		  
		  
		  
//		  NO |      상 품 명         |  단가   | 수량 | 할인 | 영수액  | 비고 |
//		  1  | 농심)츄파춥스200  |  200 | 1  | 0  |   200  |       |
		  
		  
		  byte NO = 1;
		  String 상품명 ="농심)츄파춥스200";
		  int 단가 = 200;
		  int 할인 = 0;
		  int 수량 = 1;
		  int 영수액 = 200;
		  String 비고 = "";

		  System.out.println("|  NO  |      상 품 명         |  단가   | 수량 | 할인 | 영수액  | 비고 |");
		  System.out.println("|  "+NO+"   |  "+상품명+" |  "+단가+" |  "+수량+" |  "+할인+" |  "+영수액+" |  "+비고+"  |");
		  

		  
		  

	}

}
