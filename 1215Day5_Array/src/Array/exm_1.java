package Array;

public class exm_1 {

	public static void main(String[] args) {
		// 자료형 배열이름[요소번호]  ||  자료형 [요소번호] 배열이름
		
		// 정수 값을 담는 배열을 3개 크기만큼 선언하겠다.
//		int arr[] = new int[3]; 
		
		// 문자열 형을 담는 배열 100개 크기만큼 선언 하겠다
		String arr2[] = new String[100];
		
		//배열은 0번부터 시작
//		arr[0]  = 1; // 배열 arr 0번째에 1 을 할당
//		arr[1]  = 2; // 배열 arr 1번째에 2 을 할당
//		arr[2]  = 3; // 배열 arr 2번째에 3 을 할당
//		
		
		                 //값을 바로 할당해서 크기선언 생략
//	    int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//
//		System.out.println(arr[2]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);

						//문자열 입력 할때 따옴표 잊지말고 쉼표 찍고 배열 일괄 선언 할때 처럼 양옆에 중괄호 
		String str[] = {"Hello","Java","Nice to meet you","Bye!"};
		
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		String str2[] = new String[4];
 		
		
		//단일지정일 경우 양옆에 중괄호 생략
		str2[0] = "안녕하세요";
		str2[1] = "ㅋㅋㅋㅋㅋ";
		str2[2] = "아놔";
		str2[3] = "뭐하지";
		
		
		System.out.println(str2[0]+str2[1]);
		
		
		int numb = 3;     //대괄호안에 숫자대신에 int 변수명으로도 지정가능
		System.out.println(str2[numb]);
		
 	} 

}
