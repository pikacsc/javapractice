package exam_1;

public class exam_1 {

	int b = 10;
	//인스턴스 변수:메인 밖 클래스내에서 선언한 변수
	
	
	static int c = 10;
	//정적변수
	
	public static void main(String[] args) {
		//지역변수
		int a = 10;
		
		
		//final 키워드는 상수를 만들때씀(final 이 붙여진 변수는 변경불가)
		final double PI = 3.14;
		
		
		System.out.println(a);
		System.out.println(c);
	}

}
