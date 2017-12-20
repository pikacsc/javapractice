package 연산자와클래스;

public class OperatorEx {

	public static void main(String[] args) {
		Operator op = new Operator();
		
		op.Operation(); // 증가
		
		op.Print(); // 출력
		
		Operator plus = new Operator();
		
		plus.preOperation();
		
		plus.Print();
	}

}
