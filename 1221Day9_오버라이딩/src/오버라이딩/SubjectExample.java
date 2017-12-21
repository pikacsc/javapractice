package 오버라이딩;


//오버라이드 override || overriding
// 슈퍼클래스(부모클래스)의 메소드를 서브클래스에서 재정의 하는것

class Subject{
	String name;
	
	
	void printInfo() {
		System.out.printf("과목명: %s \n",name);
	}
	
}

class MajorSubject extends Subject {
	String targetGrader;
	
	void printInfo() {
		super.printInfo();   //super클래스(부모)의 메소드 쓰기 super.메소드
		System.out.printf("대상 학생: %s \n",targetGrader);
	}
	
	
}


public class SubjectExample {

	public static void main(String[] args) {
		Subject sb = new Subject();
		sb.name = "자바";
		sb.printInfo();
		
		MajorSubject msb = new MajorSubject();
		msb.targetGrader = "오버라이딩";
		msb.printInfo();
		
		//업캐스팅
		Subject ss = new MajorSubject(); //부모타입 까지만 가능
		ss.name = "자바";
		ss.printInfo();
		
		Subject ss2 = new Subject();
		ss2.name = "자바 1111";
		ss2.printInfo();
		
		MajorSubject  ms = new MajorSubject();
		ms.name = "자바 2222";
		ms.printInfo();
		  
		//업캐스팅                   메모리영역에는 자식만큼의 분량이 올라감
		Subject sb2 = new MajorSubject(); //메소드는 부모만큼 까지밖에 못씀
		sb.name ="자바";
		
		//다운캐스팅
		MajorSubject msb2 = (MajorSubject)sb2; 
		msb2.targetGrader = "dd";
			
	}

}
