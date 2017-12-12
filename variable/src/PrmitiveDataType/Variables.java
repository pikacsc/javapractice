package PrmitiveDataType;
//기본자료형


public class Variables {

	public static void main(String[] args) {
		//변수가 어떤 타입의 데이터를 담을 것인지 명시
		int      a;
//    데이터 타입     변수명
//		세미콜론 꼭 닫아줄것
//   변수는 박스와 같고 변수명은 그박스에 이름을 써놓는것이다		
		
		
		a = 1; 
          //literal
		
		
		
	   //출력문
		System.out.println("a는 "+a);
		
		
		
		//문자 한개만 담을수 있음 
		// 문자 한개이므로 작은따옴표, String 일경우 문자열 이므로 큰따옴표를 씀
		char b = 'b';
		String c = "abc";
		
		System.out.println(b);
		System.out.println(c);
		
		//float, long 은 뒤에 f 나 l 을 써줘야됨
		float pi = 3.14f;
		long ln = 1414141241415151515l;
		
		System.out.println(pi);
		System.out.println(ln);
		
		
		//정수 i 10을 담겠다.
		int i = 10;
		int j = i;
		
		System.out.println("i=" + i + "이고 j도 " + j + "이다");
		//println 안에  ""로 구분하는 부분은 자동으로 문자열 처리 되고 그외에 변수명을 써줄때는  "+ 변수명 +" 으로 구분한다 
		
		
	}
  
}
