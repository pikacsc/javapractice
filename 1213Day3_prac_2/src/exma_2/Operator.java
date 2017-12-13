package exma_2;

public class Operator {

	public static void main(String[] args) {
		System.out.println("산술연산자");
		//8+3 =11
		System.out.println("8+3 = "+(8+3));
		
		int numb = 8;
		int numb2 = 2;
		
		int sum = 0;
		int minus = 0;
		int multi = 0;
		int dvide = 0;
		int left = 0;
		
		sum = numb + numb2;
		minus = numb - numb2;

		multi = numb * numb2;

		dvide = numb/numb2;

		left = numb%numb2;
		
		
		
		System.out.println("합계 8 + 2 = "+sum);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("빼기 8 - 2 = "+minus);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("곱하기 8 * 2 = "+multi);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("나누기 8 / 2 = "+dvide);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("나머지 8 % 2 (8/2의 나머지) = "+left);
		
		
		
		
		
	}

}
