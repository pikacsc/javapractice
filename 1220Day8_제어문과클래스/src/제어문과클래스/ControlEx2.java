package 제어문과클래스;

public class ControlEx2 {

	public static void main(String[] args) {
		//랜덤값을 가져올 때
		ControlEx2 c2 = new ControlEx2();
		int com = (int)(Math.random()*3)+1; //1~2
		
		//int com = (int)(Math.random()*y)+x; //x~y 까지 숫자중에 랜덤숫자
		
		
		c2.로또();
		c2.print();
		
	}
	
	void 로또() {
		int lottoNumb = (int)(Math.random()*45)+0;
		print(lottoNumb)
	}
	
	void print() {
		System.out.printf("첫번째 당첨번호 %d \n",lottoNumb);

		System.out.printf("두번째 당첨번호 %d \n",lottoNumb);

		System.out.printf("세번째 당첨번호 %d \n",lottoNumb);

		System.out.printf("네번째 당첨번호 %d \n",lottoNumb);

		System.out.printf("다섯번째 당첨번호 %d \n",lottoNumb);

		System.out.printf("여섯번째 당첨번호 %d \n",lottoNumb);
	}

}
