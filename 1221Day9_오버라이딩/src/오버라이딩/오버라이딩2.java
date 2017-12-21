package 오버라이딩;
class CObj{
	void Obj() {
		System.out.println("슈퍼클래스");
	}
	
	void Init() {
		System.out.println("Obj");
	}
}

class Player extends CObj{
	void Player(){
		System.out.println("서브클래스");
	}
	@Override
	void Init() {
		System.out.println("player");
	}
}

class Wizard extends Player{
	void Wizard(){
		System.out.println("손자클래스");
	}
	
	@Override
	void Init() {
		System.out.println("wizard");
	}
	
}


public class 오버라이딩2 {

	public static void main(String[] args) {
		CObj pObj = new CObj();
		pObj.Init(); // obj
		
		CObj pObj2 = new Player(); //업캐스팅, 메모리는 Player 까지 이지만 실제 올려놓는것은 CObj임
		pObj2.Init(); //Player 내에 Init()메소드가 오버라이딩 되있어서 사용가능함
		
		
		CObj pObj3 = new Wizard(); //업캐스팅, 메모리는 Wizard 까지 이지만 타입은 CObj임
		pObj3.Init();
		System.out.println();
		
		
		
		//다운캐스팅
		Player DpObj2 = (Player)pObj2;
		DpObj2.Init();
		DpObj2.Player();
		
		Wizard DpObj3 = (Wizard)pObj3;
		DpObj3.Init();
		DpObj3.Wizard();
		
	}

}
