package 반복문;

public class for_1 {

	public static void main(String[] args) {
		//for
		//for(1.초기값;2. 조건식;3.반복하기위한 증감식){
		//}
		//
		//for 중괄호가 없으면 한줄로직 가능
		
//		for(int i = 0; i < 10; i++) { 
//			System.out.printf("안녕하세요. %s번째 학생 입니다 \n", i);
//		}
//		
//		String str[] = {"안","녕","하세","요"};
//		
//		for(int i = 0; i < str.length; i++) {
//			System.out.printf("%s",str[i]);
//			if(i==3) {
//				System.out.println();
//				System.out.println("만나서 반갑습니다");
//			}
//		}
//		
//		
		/*
		 * 
		 * 1. for문 실행한 후 오직 한번만 실행되는 초기화 작업
		 * ; 구분되고 여러문장 나열 가능 
		 */
//			for(int i=0,j=0; i<5 ; i++) {
//				
//			}
		  
		//초기화 할일 없으면 비 1번란은 비워둘 수 있음
//			int i = 0;
//		   for(;i<10;i++) {
//			   
//		   }
//		   
		   
//		2.논리형 변수나 논리연산만 가능 
//	 	반복조건이 true이면 반복계속, false 이면 종료
//		반복 조건이 true 상수인 경우, 무한반복
//		반복 조건이 비어있으면 true로 간주
//			   for(;true;i++) {
//				   System.out.println(i);
//			   }  
//			   for(;;) {
//				   System.out.println("무한반복");
//			   }
		   
		   
		/*
		 * 3.반복 작업 문장들의 실행 후 처리 작업
		 *   ,(콤마)로 구분해서 여러문장 나열 가능
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
//			 sum += i;   // sum = sum + i; i가 누적됨
//			 switch(i) {
//			 	case 4:
//			 		System.out.println("합계="+sum);
//			 }
//		 }
//		for(int i = 5; i>=1;i--) {
//			System.out.println("i = "+i);
//		}	 
		 
		 //배열과 같이 쓸때
//		 int array[] = {1,2,3,4,5};
//		               
//		                 //배열갯수
//		 for(int i = 0;i<array.length;i++) {
//			  System.out.println("배열 ="+array[i]);
//		 }
//		 
		 //2차원 배열 출력
		
		
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
