package first;

/*
 * 
 * 3. 키를 센티미터 단위로 입력하세요.
   출력 키가 m  cm 이시군요.
   입력 예시 ) 173
   1m 73cm
[출처] 8일차 문제 (NCS자바프로그래밍&게임프로그래밍) |작성자 헤이즐넛
 */
import java.util.Scanner;

public class HeightChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HeightChecker hc = new HeightChecker();
		System.out.print("키를 센티미터 단위로 입력하세요:");
		int x = sc.nextInt();
		hc.printHeight(x);
	}
	
	void printHeight(int x) {
		String y = x +"";
		char a = y.charAt(0);
		char b = y.charAt(1);
		char c = y.charAt(2);
		 System.out.printf("출력 키가  %c m %c%c cm 이시군요.",a,b,c);
	}

}
