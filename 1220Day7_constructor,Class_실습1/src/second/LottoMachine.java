package second;
//8. �ζ� ��ȣ �����⸦ �ϼ��Ͻÿ�, for��, �迭 ��� (�ߺ� �ȵǰ� ������)
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
	
	//Ǯ��:�����̿� 
	void numberRoller2() {
		int iLotto[] = new int [45]; 
		for(int i=0;i<45;i++) {
			iLotto[i] = i+1;  // �ε��� 0�� ���ͷ��� 1�� ���Բ�   �ε��� 0���� 44���� �̹� ���� �� ���س���
							  // �� ���ڵ�θ� ������ �ζ���÷�� �ϹǷ� �ߺ��̵ɼ� ����
		}
		//����
		for(int i =0; i<100;i++) {
			int random = (int)(Math.random()*45); //0~44
			int iFirst = random; 
			int iSecond = random;
			
			
			/*
			 * a�� b ���ͷ��� �ٲٱ�
			 *  c = a;
			 *  a = b;
			 *  b = c;
			 *  c ��� �ӽ� �ڸ��� ������༭ a�� b�� ���� �ٲܼ� �ְԲ���
			 */
			
			
			//  ���ӽ��ڸ�����
			int iDest = iLotto[iFirst];                 
			iLotto[iFirst] = iLotto[iSecond];
			iLotto[iSecond] = iDest;  
			
			
		}
		for(int i = 0;i<7;i++) {
			System.out.printf("%d��° ��÷��ȣ : %d \n",i+1,iLotto[i]);
			if(i==6) System.out.printf("������ %d����� ��÷��ȣ",i+1);
		}
		
		
			
	}
}
		
	
