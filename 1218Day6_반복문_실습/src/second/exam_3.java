package second;

public class exam_3 {

	public static void main(String[] args) {
		//1번문제 세로로 출력하기
		
		for(int x=1;x<=9;x++) {
			for(int y=2;y<=9;y++) {
				System.out.printf("%s x %s = %s ",y,x,x*y);    //1번문제 코드에서 출력부분에 x ,y 위치만 수정
			}
			System.out.println();
		}
		
	}

}
