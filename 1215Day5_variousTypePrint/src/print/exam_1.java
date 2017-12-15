package print;
//출력문 다양한 활용
//printf() 형식화된 문자 출력

public class exam_1 {

	public static void main(String[] args) {
		//문자, 정수값   [%c] [%d]
		char a = 'A';
		System.out.printf("[%c] \n \n",a); // %c 자리에 A를 넣는 방식 출력하면 [A] 가 나옴 ,     [7]       
		                    //\n 출력문내에 개행 명령어 ,[enter]역할
		
		System.out.printf("[%d] \n \n", 7 ); // %d 자리에 ,int 값을 가지고 온다 출력하면 [7]가 나옴,
		
		System.out.printf("[%5d] \n \n", 77);  //  %숫자d,c 등을 할때 숫자는 숫자만큼 띄어준다(스페이스바를 숫자만큼 눌러주는것과 같음 동시에 오른쪽 정렬을 해줌)       [   77] 
		
		
		System.out.printf("[%-5d] \n \n", 77);  //  %숫자d,c 등을 할때 숫자는 숫자만큼 띄어준다(스페이스바를 숫자만큼 눌러주는것과 같음 동시에 왼쪽 정렬을 해줌)     [77   ]
		
		
		System.out.printf("[%06d] \n \n", 7);  // 출력문이 [00007] 으로 나옴 0이   0숫자-1 개만큼 들어감      [000007] 
		
		System.out.printf("[%+d]\n \n", 12345); // %+ 는 %다음에 오는 연산자기호를 맨앞에 붙여줌, 일반적으로 +연산자는 생략됨       [+12345]
		
		System.out.printf("[%d]\n \n", -12345); // %- 는 안됨, -는 그냥 숫자 앞에 붙여줌       [-12345]
		
		//소수점 자리수 [%f]
		System.out.printf("[%f] \n\n", 3.141592); // [3.141592]
		System.out.printf("[%5f] \n\n", 3.141592); //  [3.141592]   %5f는 의미 없음
		
		System.out.printf("[%.2f] \n\n", 3.141592); //  %.숫자 는 소수 해당숫자 자리 까지 출력             [3.14] 
		
		System.out.printf("[%20.5f] \n\n", 3.141592); // 20칸을 띄우고 소수점 5번째 자리 까지 출력               [             3.14159] 
  		
		
		//문자열형 [%s]
		
		System.out.printf("[%s] \n\n", "안녕하세요"); // [안녕하세요]
		
		System.out.printf("[%10s] \n\n", "안녕하세요"); // [     안녕하세요] 
		
		System.out.printf("[%-10s] \n\n", "안녕하세요"); // [안녕하세요     ] 
		
		System.out.printf("[%2.2s] \n\n", "안녕하세요"); // [안녕] 
		
		System.out.printf("[%3.2s] \n\n", "안녕하세요"); // [ 안녕]
		
		System.out.printf("\t %d \n\n", 1); // \t 는 키보드 [Tab]키이다
		
		
		//16진수 및 8진수
		System.out.printf("[%x]\n \n", 0xff); //%x 16진수를 표기해주는 출력 포맷       [ff]
		
		System.out.printf("[%X]\n \n", 0xff); //%X 16진수를 대문자로 표기해주는 출력 포맷[대문자]      [FF]
	
		System.out.printf("[%o]\n \n", 0123); //%o 8진수를 표기       [123]
		
		
		
	} 

}
