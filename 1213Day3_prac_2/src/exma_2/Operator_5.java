package exma_2;

public class Operator_5 {

	public static void main(String[] args) {
		//논리 연산자
		
		//   ||  :   또는    or   (a==2) || (a==10) 변수 a가 2와 같거나 10과 같다

		//   &&  : 그리고    and   (a>2) && (a<10) 변수 a가 2초과  10미만
		
		//   !   :  ~아니다         !(a==2)  변수 a의 값이 2가 아니다.
		
		int a = 10, b = 10;
		
		System.out.println("(a==10)&&(b==5) : "+((a==10)&&(b==5)));
		//a는 10이고 b는 5이다
		
		System.out.println("(a==10)||(b==5) : "+((a==10)||(b==5)));
		//a는 10이거나 b는 5이다
		
		System.out.println("!(a==10) : "+( !(a==10) ));
		// 변수 의 값이 10이 아니다
		
		
		
		
	}

}
