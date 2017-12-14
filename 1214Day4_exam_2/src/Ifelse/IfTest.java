package Ifelse;

public class IfTest {

	public static void main(String[] args) {
//		boolean b = true;
//		if(b) {
//			System.out.println("참입니다.");
//		} else {
//			System.out.println("거짓입니다.");
//		} 
//		
		int i = 10;
		
		//2로 나누어서 나머지가 0이면 짝수입니다.
		if(i%2==0) {
			System.out.println("짝수입니다.");
		} 
		
		if(i%3==0) { //3의 배수라면
			System.out.println("3의 배수");
		}
		
		if(i%5==0) { //5의 배수라면
			System.out.println("5의 배수");
		} else if (i%5==1) System.out.println("5의 배수 +1");
		else System.out.println("5의 배수 + 2혹은 3혹은 4");
		
		
		
	}

}
