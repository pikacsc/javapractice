package 연산자와클래스;

public class Operator {
		int i = 5;
		
		//증가를 하는 동작
		void Operation() {
			i++;
		}
		
		void preOperation() {
			++i;
			
		}
		
		//출력관련 함수
		void Print() {
			System.out.printf("i= %d \n",i);
		}
		
}
