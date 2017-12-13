package casting;

public class Priority {
	
	public static void main(String[] args) {
		System.out.println("3+2*8-4="+(3+2*8-4));//기본 사칙연산은 */ 먼저 연산후 +-를 연산함
		
		
		System.out.println("3+2*8-4="+((3+2)*(8-4))); //()처리를 해서 계산 순서를 다르게 할수도 있다
		
		
		//비트연산  <<,>>
		//10  → 이진수→ 1010
		//  10<<1
		//00010100
		
		System.out.println("10<<1 = "+(10<<1));
		
		
		// 10>>1
		// 0101
		System.out.println("10>>1 = "+(10>>1));
	}
}
