package 오버로딩;

class Calculator{
	//메소드 오버로딩:함수의 시그니쳐는 같고 인자(parameter)가 다른 함수를 구현하는것
	//
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
}



public class Overloding {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(20, 30);
		c.add(20, 30, 40);
	}

}
