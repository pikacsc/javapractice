package 반복문;

public class While_1 {

	public static void main(String[] args) {
		// while(조건문){
		// 		작업할 문장
		// }
		// 조건문이 true 일동안에 수행됨
		
		
//		int i = 0;
//		
//		while(i<5) {
//			i++;
//			System.out.printf("나무를 %s번 찍었습니다.\n",i);
//		}
//		
//		
//		int i = 0;
////		
		//무한반복
//		while(0<i) {
//			i++;
//			System.out.printf("나무를 %s번 찍었습니다.\n",i);
//		}
//		
		//1~4까지의 합 구하기
//		int sum = 0;
//		while(i<5) {
//			sum += i;
//			i++;
//		}
//		System.out.printf("합계 : %s",sum);
		
		
//		do {
//		     반드시 거치는 과정
//		}while();
//		
//		boolean flag = false;
//		
//		while(flag) {
//			System.out.println("실행이 안되는 코드");
//		}
//		
//		
//		int a = 0;
//		do {
//			System.out.println("while(조건)에 관계없이 반드시 실행됨.");
//		} while(a<5);
//		
		//break; 반복문에서 탈출하는 명령어
//		for(int i = 0;i<5;i++) {
//			System.out.println("안녕하세요");
//			switch(i) { 
//				case 3:
//					break;
//			}
//		}
		
//		int a = 0;
//		while(a<4) {
//			System.out.println("안녕하셈");
//			a++;
//			switch(a) {
//			case 3:
//				System.out.println("반갑습니다.");
//				break;
//			}
//		}
		
		//continue 를 만나면 반복문 처음으로 돌아간다
//		
//		for(int i=0; i<10; i++) {
//			System.out.printf("%s번째 실행 \n",i+1);
//			switch(i) {
//			case 3:
//				System.out.println("3회 완료");
//				continue;
//			}	
//		}
//		
		
		//라벨로 분기하는 경우
		//continue 라벨;
		//특징은 특정 라벨의 다음 반복으로 분기
		//중첩 반복(for문 안에 for문)에서 바깥의 반복문으로 빠져나갈때 주로 사용
		
		
		//break 라벨;
		//반복문을 벗어나는 라벨이 붙은 곳으로 바로 벗어남
		//중첩 반복(for문 안에 for문)을 한 번에 벗어날 때 주로 사용
		int count = 1;
		
		LABEL:   //아무이름:   continue 라벨 인 경우 jfor문이 아닌 ifor문을 돌게됨 
			//break 라벨 인경우 라벨 밑까지는 반복을 하지않게됨 보통 가독성을 위해 LABEL로 표기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) continue LABEL; //j for문 건너뛰고i for문을 돌게됨 , continue LABEL; || break LABEL;
				System.out.printf("안녕하세요 %s번째 하고있습니다. \n", count++);
			}
		}
		System.out.println("반복문 끝~");
		
		
	}

}
