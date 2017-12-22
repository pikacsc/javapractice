package 파이널;

import java.util.Scanner;

final class Person{//클래스앞에 붙여주면 상속 불가능한 클래스가 됨

	
}

class Person2{
	final void 오버라이딩불가능한지보는테스트메소드() {
		System.out.println("난 재정의가 불가능하지롱~ 그대로 슈퍼클래스가 쓰는데로 그대로 써야됨 ㅋㅋㅋ");
	}
}


public class Example extends Person2 {

	public static void main(String[] args) {
		final String name ="홍길동"; //변수앞에 붙여주면 리터럴값 초기화 불가능
		
		//원의 반지름을 실수로 입력받아 원의 둘레와 길이와 
		//면적을 소수점 둘째자리 까지 출력하는 프로그램을 작성해보기
		float r; //반지름
		final float pi = 3.14f; //파이널 키워드로 고정, 상수
		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요");
		r = sc.nextFloat();
		System.out.printf("원의 둘레는: %.2f \n",(2*r)*pi);
		System.out.printf("원의면적: %.2f \n",pi*(r*r));
		
		Person2 example = new Example(); //동적바인딩을 하기위해서 업캐스팅함
		
		example.오버라이딩불가능한지보는테스트메소드();
		
	}
	
	
	
	
	

}
