package second;

public class exam_4 {
	/*
	 * 
	 * 4.다음과 같은 형태로 출력하시오.이중 for문 사용
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
[출처] 자바 6일차 문제 중급 (NCS자바프로그래밍&게임프로그래밍) |작성자 헤이즐넛
	 */

	public static void main(String[] args) {
		  String stars[] = {"*","**","***","****","*****"};

		  LABEL:
			  for(int i=0,j=0;i<stars.length;i++) {
				  System.out.println(stars[i]);
				  if(i==4) {
					  System.out.println();
					  for(;i>=0;i--) {
						  System.out.println(stars[i]);
						  if(i==0) {
							  System.out.println();
							  break LABEL;
						  } 
					  }
				  }
		   
			  }
		  
		  LABEL2:
			  for(int i=0;i<stars.length;i++) {
				  System.out.printf("%5s \n",stars[i]);
				  if(i==4) {
					  System.out.println();
					  for(;i>=0;i--) {
						  System.out.printf("%5s \n",stars[i]);
						  if(i==0) break LABEL2;
					  }
				  }
			  } 
	}	
		 
	

}
