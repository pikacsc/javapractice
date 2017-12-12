package Ojcsample;

public class OjcSample {

	public static void main(String[] args) {
		// int 는 제한된 범위안에서 - + 정수를 담을 수 있다
		// sum 
		int sum = 0; //선언문, 로컬변수선언
		
		
		
		    //for(초기값 ; 제한범위 ; 제한범위까지 하는 동작)
		for(int i = 1; i<10; i++) {             //반복문
			sum = sum + i;  //대입문
			if(sum == 9) { 	
				System.exit(9);   //제어문 
			System.out.println("합계는" + sum);//출력문
			}
		}
		/*시작
		 * 
		 * 아무거나 적어도 다 주석이 된다.
		 * 
		 * 
		 * 
		 * 
		끝까지 주석 처리 */
//		블럭지정후 ctrl + / 해주면 주석처리가 쉬워짐
		
		
	}

}
