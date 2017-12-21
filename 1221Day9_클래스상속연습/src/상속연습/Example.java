package 상속연습;
class 슈퍼클래스{
	   String name;
	   String id;
	   void Person(String name){
	       this.name = name;
	       }
}

class 서브클래스 extends 슈퍼클래스{
    String grade;
    String department;

    void Student(String name){
       super.Person(name);
      }
     
    
}



public class Example {

	public static void main(String[] args) {
		
		//일반적으로 슈퍼클래스일수록 데이터가 적고 제어범위가 적음
		//서브클래스로 가면 갈수록 데이터가 많아지고 제어범위도 많아짐
		//때문에 업캐스팅은 서브클래스의 더많은 데이터를 가지고 있지만  
		//슈퍼클래스의 데이터만 사용할수 있게 제한을 두는것이고
		//다운캐스팅은 업캐스팅 제한을 푸는것, 즉 
		//본래 서브클래스인 리터럴을 서브클래스에 넣는것이다
		
		
		슈퍼클래스 업캐스팅 = new 서브클래스();// 업캐스팅 
			
	
		업캐스팅.id = "슈퍼클래스 변수1 수정";
		업캐스팅.name = "슈퍼클래스 변수2 수정";
		System.out.println(업캐스팅.id);
		System.out.println(업캐스팅.name);
		
		System.out.println();
		
		서브클래스 다운캐스팅 = (서브클래스)업캐스팅;
		//서브클래스 다운캐스팅 = (서브클래스)new 슈퍼클래스(); 에러남
		//정상적인 다운캐스팅은 업캐스팅한 클래스만이 다운캐스팅이 가능함  
		// 부모클래스 x = new 자식클래스(); 업캐스팅
		// 자식클래스 y = (자식클래스)x; 업캐스팅한 클래스를 다운캐스팅함, 즉 다운캐스팅은 업캐스팅 이후에만 가능함
		
		다운캐스팅.department = "서브클래스 변수1 수정";
		다운캐스팅.grade = "서브클래스 변수2 수정";
		System.out.println(다운캐스팅.department);
		System.out.println(다운캐스팅.grade);
		
		
		
		Master 사장 = new Master(); //가장많은 권한을 가짐 
		MemberDTO 직원 = new MemberDTO(); //중간급 권한을 가짐 그러나 Master 의 권한은 없음
		사람 손님 = new 사람(); //가장 Super class, 가장 권한이 없음
		
		사람 신입직원 = new MemberDTO(); 
		//업캐스팅:MemberDTO의 권한을 가질수 있지만 영역을 사람으로만 제한을 두는것
		//메모리로 치면 서브클래스의 많은 데이터가 있지만 슈퍼클래스의 좁은 메모리 범위때문에
		//짤려서(제한되서) 슈퍼클래스 범위 한정으로 구현됨
		
		//승진! 권한 제한 풀기
		MemberDTO 승진한직원 = (MemberDTO)신입직원; //다운캐스팅:업캐스팅으로 제한된 영역을 푸는것
		
		
		
		사람 예비사장 = new Master();
		Master 사장2 = (Master)예비사장;
		
		
	}

}
