package �ݺ���;

public class While_1 {

	public static void main(String[] args) {
		// while(���ǹ�){
		// 		�۾��� ����
		// }
		// ���ǹ��� true �ϵ��ȿ� �����
		
		
//		int i = 0;
//		
//		while(i<5) {
//			i++;
//			System.out.printf("������ %s�� ������ϴ�.\n",i);
//		}
//		
//		
//		int i = 0;
////		
		//���ѹݺ�
//		while(0<i) {
//			i++;
//			System.out.printf("������ %s�� ������ϴ�.\n",i);
//		}
//		
		//1~4������ �� ���ϱ�
//		int sum = 0;
//		while(i<5) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("�հ� : %s",sum);
		
		
//		do {
//		     �ݵ�� ��ġ�� ����
//		}while();
//		
//		boolean flag = false;
//		
//		while(flag) {
//			System.out.println("������ �ȵǴ� �ڵ�");
//		}
//		
//		
//		int a = 0;
//		do {
//			System.out.println("while(����)�� ������� �ݵ�� �����.");
//		} while(a<5);
//		
		//break; �ݺ������� Ż���ϴ� ��ɾ�
//		for(int i = 0;i<5;i++) {
//			System.out.println("�ȳ��ϼ���");
//			switch(i) { 
//				case 3:
//					break;
//			}
//		}
		
//		int a = 0;
//		while(a<4) {
//			System.out.println("�ȳ��ϼ�");
//			a++;
//			switch(a) {
//			case 3:
//				System.out.println("�ݰ����ϴ�.");
//				break;
//			}
//		}
		
		//continue �� ������ �ݺ��� ó������ ���ư���
//		
//		for(int i=0; i<10; i++) {
//			System.out.printf("%s��° ���� \n",i+1);
//			switch(i) {
//			case 3:
//				System.out.println("3ȸ �Ϸ�");
//				continue;
//			}	
//		}
//		
		
		//�󺧷� �б��ϴ� ���
		//continue ��;
		//Ư¡�� Ư�� ���� ���� �ݺ����� �б�
		//��ø �ݺ�(for�� �ȿ� for��)���� �ٱ��� �ݺ������� ���������� �ַ� ���
		
		
		//break ��;
		//�ݺ����� ����� ���� ���� ������ �ٷ� ���
		//��ø �ݺ�(for�� �ȿ� for��)�� �� ���� ��� �� �ַ� ���
		int count = 1;
		
		LABEL:   //�ƹ��̸�:   continue �� �� ��� jfor���� �ƴ� ifor���� ���Ե� 
			//break �� �ΰ�� �� �ر����� �ݺ��� �����ʰԵ� ���� �������� ���� LABEL�� ǥ��
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) continue LABEL; //j for�� �ǳʶٰ�i for���� ���Ե� , continue LABEL; || break LABEL;
				System.out.printf("�ȳ��ϼ��� %s��° �ϰ��ֽ��ϴ�. \n", count++);
			}
		}
		System.out.println("�ݺ��� ��~");
		
		
	}

}
