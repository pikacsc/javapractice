package second;
//8. 로또 번호 생성기를 완성하시오, for문, 배열 사용 (중복 안되게 만들어보기)
public class LottoMachine {

	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine();
		lotto.numberRoller();
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
}
		
	
