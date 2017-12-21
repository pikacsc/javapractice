package second;
//8. 로또 번호 생성기를 완성하시오, for문, 배열 사용 (중복 안되게 만들어보기)
public class LottoMachine {

	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine();
		lotto.numberRoller2();
	}
	
	void numberRoller() {
		int n[] = new int[6];
		int randomNumb = (int)(Math.random()*45)+1;
		for(int i=0;i<6;i++) {
			n[i]= randomNumb;
			for(int j=0;j<6;j++) {
				n[j] = randomNumb;		
				if(n[i]==n[j]) {
					
				}else {
					continue;
					}
			}
					
		}
	}
	
	//풀이:셔플이용 
	void numberRoller2() {
		int iLotto[] = new int [45]; 
		for(int i=0;i<45;i++) {
			iLotto[i] = i+1;  // 인덱스 0에 리터럴값 1이 들어가게끔   인덱스 0부터 44까지 이미 값을 다 정해놓기
							  // 그 숫자들로만 가지고 로또추첨을 하므로 중복이될수 없음
		}
		//셔플
		for(int i =0; i<100;i++) {
			int random = (int)(Math.random()*45); //0~44
			int iFirst = random; 
			int iSecond = random;
			
			
			/*
			 * a와 b 리터럴값 바꾸기
			 *  c = a;
			 *  a = b;
			 *  b = c;
			 *  c 라는 임시 자리를 만들어줘서 a를 b를 서로 바꿀수 있게끔함
			 */
			
			
			//  ↓임시자리역할
			int iDest = iLotto[iFirst];                 
			iLotto[iFirst] = iLotto[iSecond];
			iLotto[iSecond] = iDest;  
			
			
		}
		for(int i = 0;i<7;i++) {
			System.out.printf("%d번째 당첨번호 : %d \n",i+1,iLotto[i]);
			if(i==6) System.out.printf("마지막 %d행운의 당첨번호",i+1);
		}
		
		
			
	}
}
		
	
