package �ݺ���;

public class for_1 {

	public static void main(String[] args) {
		//for
		//for(1.�ʱⰪ;2. ���ǽ�;3.�ݺ��ϱ����� ������){
		//}
		//
		//for �߰�ȣ�� ������ ���ٷ��� ����
		
//		for(int i = 0; i < 10; i++) { 
//			System.out.printf("�ȳ��ϼ���. %s��° �л� �Դϴ� \n", i);
//		}
//		
//		String str[] = {"��","��","�ϼ�","��"};
//		
//		for(int i = 0; i < str.length; i++) {
//			System.out.printf("%s",str[i]);
//			if(i==3) {
//				System.out.println();
//				System.out.println("������ �ݰ����ϴ�");
//			}
//		}
//		
//		
		/*
		 * 
		 * 1. for�� ������ �� ���� �ѹ��� ����Ǵ� �ʱ�ȭ �۾�
		 * ; ���еǰ� �������� ���� ���� 
		 */
//			for(int i=0,j=0; i<5 ; i++) {
//				
//			}
		  
		//�ʱ�ȭ ���� ������ �� 1������ ����� �� ����
//			int i = 0;
//		   for(;i<10;i++) {
//			   
//		   }
//		   
		   
//		2.���� ������ �����길 ���� 
//	 	�ݺ������� true�̸� �ݺ����, false �̸� ����
//		�ݺ� ������ true ����� ���, ���ѹݺ�
//		�ݺ� ������ ��������� true�� ����
//			   for(;true;i++) {
//				   System.out.println(i);
//			   }  
//			   for(;;) {
//				   System.out.println("���ѹݺ�");
//			   }
		   
		   
		/*
		 * 3.�ݺ� �۾� ������� ���� �� ó�� �۾�
		 *   ,(�޸�)�� �����ؼ� �������� ���� ����
		 *
		 *
		 */
//		 for(int i = 0,j = 0; i<5; i++, j++)
//		 {
//		 		System.out.println("i = "+i+",j = "+j);
//		 }
//		 
//		 
//		 int sum = 0;
//		 
//		 for(int i = 0; i<5; i++){
//			 sum += i;   // sum = sum + i; i�� ������
//			 switch(i) {
//			 	case 4:
//			 		System.out.println("�հ�="+sum);
//			 }
//		 }
//		for(int i = 5; i>=1;i--) {
//			System.out.println("i = "+i);
//		}	 
		 
		 //�迭�� ���� ����
//		 int array[] = {1,2,3,4,5};
//		               
//		                 //�迭����
//		 for(int i = 0;i<array.length;i++) {
//			  System.out.println("�迭 ="+array[i]);
//		 }
//		 
		 //2���� �迭 ���
		
		
		int array[][] = new int[3][3];
		
		int count = 1;
		 for(int i=0;i<3;i++) {
			 for(int j = 0;j<3;j++) {
				 array[i][j] = count++;
				 System.out.printf("array[%s][%s] = %s  \n",i,j,array[i][j]);
			 }
		 }
		
		 

	}

}
