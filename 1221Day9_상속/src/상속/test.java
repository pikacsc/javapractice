package 상속;

public class test {

	public static void main(String[] args) {
		Person p = new Person();
		p.name ="홍길동";
		p.age = 25;
		p.weight = 75.0f;
		System.out.println("부모클래스 Person");
		System.out.println(p.eat());
		System.out.println(p.sleep());	
		System.out.println();
		
		Student stdt = new Student();
		stdt.name = "최성찬";
		stdt.age = 26;
		stdt.weight = 65.0f;
		System.out.println("Person을 상속받은 Student 클래스");
		System.out.println(stdt.eat());
		System.out.println(stdt.sleep());
		System.out.println(stdt.study());
		
	}

}
