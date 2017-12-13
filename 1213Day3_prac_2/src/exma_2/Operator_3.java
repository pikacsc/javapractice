package exma_2;

public class Operator_3 {

	public static void main(String[] args) {
		//++ 1을 더한다. x++, ++x  변수 x에 1을 더한다.(x = x+1)
		//-- 1을 뺀다.  x--, --x 변수 x에서 1을 뺀다.(x = x-1)
		
		//전위 단항 연산자
		int a = 10;
		
		System.out.println("++a 는 "+(++a)); //++a은 변수 a에 +1된값을 바로 할당한다
		System.out.println("++a 는 "+(++a));

		System.out.println("");
		System.out.println("");
		
		System.out.println("a초기화");
		a =10;
		System.out.println("");
		System.out.println("");
		
		
		//후위 단항 연산자
		System.out.println("a++ 는 "+(a++)); //a++은 변수 a에 초기값을 먼저 할당하고 그다음에 출력할때는 +1된값을 보여준다   
		System.out.println("a++ 는 "+(a++)); 
		System.out.println("현재 a는 "+a);
		
		
		
	}

}
