package 연산자와클래스;
class Operator2{
	int i = 0, j=0;
	
	//연산
	void frontP(int a) {
		i = a;
		j = ++i;
	}
	
	void backP(int a) {
		i = a;
		j = i++;		 
	}
	
	//출력
	
	void Printer() {
		System.out.printf("j=i++; 실행후, i= %d, j= %d \n",i,j);
		System.out.printf("j=++i; 실행후, i= %d, j= %d \n",i,j);
	}
	
}

public class OperatorEx2 {

	public static void main(String[] args) {
		Operator2 op2 = new Operator2();
		int a = 6;
		op2.frontP(a);
		
		op2.Printer();
	}

}
