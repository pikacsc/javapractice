package first;

import java.util.Scanner;

/*
 * 1.전화번호(010-1234-5678)에서 국번(010)을 추출하시오.

2.전화번호(010-1234-5678)에서 '-'을 제거하시오.
=>01012345678 로 변경하기

3. 상품코드(E20160001)에서 상품카테고리('E')를 추출하시오.

4. 상품코드(E20160001)에서 년도('2016')를 추출하시오.

5. 주소록 문자열을 분리하시오.
홍길동,010-1111-2222,hkd@hkd.com

 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("010-xxxx-xxxx 처럼 전화번호를 입력하세요");
		String pn = sc.nextLine();
		System.out.println("상품코드를 E2016XXXX로 입력하세요: ");
		String code = sc.nextLine();
		String ps = "홍길동,010-1111-2222,hkd@hkd.com";

			System.out.println("1.전화번호(010-1234-5678)에서 국번(010)을 추출하시오.");
			PCodeExtrac_2 PC2 = new PCodeExtrac_2();
			System.out.println(PC2.Extrac010(pn));
			
			
			System.out.println("2.전화번호(010-1234-5678)에서 '-'을 제거하시오.");
			System.out.println(PC2.removeH(pn));
			System.out.println();
			
			System.out.println("3. 상품코드(E20160001)에서 상품카테고리('E')를 추출하시오.");
			System.out.println(PC2.Extrac_1(code));
			System.out.println();
			
			System.out.println("4. 상품코드(E20160001)에서 년도('2016')를 추출하시오.");
			System.out.println(PC2.Extrac2(code));
			System.out.println();
			
			System.out.println("5. 주소록 문자열을 분리하시오.");
			String ps2[] = ps.split(",");
			for(int i=0;i<3;i++) {
				System.out.println(ps2[i]);	
			}
		}
}


