package second;

public class exam_4 {
	/*
	 * 
	 * 4.������ ���� ���·� ����Ͻÿ�.���� for�� ���
*
**
***
****
*****

*****
****
***
**
*

    *
   **
  ***
 ****
*****

*****
 ****
  ***
   **
    *
[��ó] �ڹ� 6���� ���� �߱� (NCS�ڹ����α׷���&�������α׷���) |�ۼ��� �������
	 */

	public static void main(String[] args) {

//		  LABEL:
//			  for(int i=0,j=0;i<stars.length;i++) {
//				  System.out.println(stars[i]);
//				  if(i==4) {
//					  System.out.println();
//					  for(;i>=0;i--) {
//						  System.out.println(stars[i]);
//						  if(i==0) {
//							  System.out.println();
//							  break LABEL;
//						  } 
//					  }
//				  }
//		   
//			  }
//		  
//		  LABEL2:
//			  for(int i=0;i<stars.length;i++) {
//				  System.out.printf("%5s \n",stars[i]);
//				  if(i==4) {
//					  System.out.println();
//					  for(;i>=0;i--) {
//						  System.out.printf("%5s \n",stars[i]);
//						  if(i==0) break LABEL2;
//					  }
//				  }
//			  } 
		
		//Ǯ��
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>j || i==j) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				//System.out.printf("%d%d ",i,j);
				if(i+j<=4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}	
		 
	

}
