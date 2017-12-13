package casting;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class DataType {

	public static void main(String[] args) {
	//byte < short < int < long < float < double
	// 작은 범위에서 큰범위로 자료형 변환이 묵시적으로 가능하다.
	// 큰범위 데이터 타입에서 작은 범위 데이터 타입으로 변환이 되게 만들때 Casting 이라는걸 해야된다.
	// 소수점있는 데이터 타입들은 정수 소수점부분이 값이 짤릴수 있다
		int a = 10;
		
		double d = a;
		
		System.out.println("a값은 "+a);
		System.out.println("d값은 "+d);
		System.out.println("");
		double d2 = 3.14;
		int b = (int) d2;
		System.out.println("b값은 "+b);
		
	
		/*
		 * Casting 방법
		 *작은범위 데이터타입  변수명 = (변환할 데이터 타입) 변수명; 
		 *
		 * 
		 * int b = d2; 할시 에러가 뜸
		 */
	}

}
