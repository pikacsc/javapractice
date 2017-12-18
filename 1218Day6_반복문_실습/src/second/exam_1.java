package second;

public class exam_1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1. 구구단을 만들고 
2 x 1 = 1 2 x 2 = 4 .......2 x 9 = 18
3 x 1 = 3 3 x 2 = 6 ......
4 x 1 = 4 4 x 2 = 8 ......
출력을 가로로 출력해주세요.
[출처] 자바 6일차 문제 중급 (NCS자바프로그래밍&게임프로그래밍) |작성자 헤이즐넛
		 * 
		 */
		for(int x=2;x<=9;x++) {
			for(int y=1;y<=9;y++) {
				System.out.printf("%s x %s = %s ",x,y,x*y);
			}
			System.out.println();
		}
		
		
	}

}
