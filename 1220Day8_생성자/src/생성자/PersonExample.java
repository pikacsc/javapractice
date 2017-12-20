package 생성자;

class Person{
	String name;
	int age;
	
	
	
	//기본생성자는 자기클래스이름의 메소드(함수)다, 접근제어자, 리턴타입을 표시안해도됨,
	//보통 비어있어서 생략됨 
	//↓아래처럼 초기화시킬때 쓰이기도함
	Person(){
		name = "홍길동";
		age = 24;
	}
	
	
}


public class PersonExample {

	public static void main(String[] args) {
		  Person2 p = new Person2();    //생성자는 new Person()을 입력함과 동시에 동작됨 일반 메소드들과는 다르게 객체.메소드이름() 방식으로 동작안함
		  
		  System.out.println(p.name);
		  System.out.println(p.age);
		  
		  Person2 p2 = new Person2("영희",25);
		
		  System.out.println(p2.name);
		  System.out.println(p2.age);
		  
	}

}
