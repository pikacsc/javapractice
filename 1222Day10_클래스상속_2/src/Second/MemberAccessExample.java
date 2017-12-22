package Second;

public class MemberAccessExample {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.p = 5;
		b.p = 5;
		
		b.setN(10);
		int i = b.getN();
		
		b.setM(20);
		System.out.println(b.toString());
		
				
	}
}
