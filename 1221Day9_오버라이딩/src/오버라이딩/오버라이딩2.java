package �������̵�;
class CObj{
	void Obj() {
		System.out.println("����Ŭ����");
	}
	
	void Init() {
		System.out.println("Obj");
	}
}

class Player extends CObj{
	void Player(){
		System.out.println("����Ŭ����");
	}
	@Override
	void Init() {
		System.out.println("player");
	}
}

class Wizard extends Player{
	void Wizard(){
		System.out.println("����Ŭ����");
	}
	
	@Override
	void Init() {
		System.out.println("wizard");
	}
	
}


public class �������̵�2 {

	public static void main(String[] args) {
		CObj pObj = new CObj();
		pObj.Init(); // obj
		
		CObj pObj2 = new Player(); //��ĳ����, �޸𸮴� Player ���� ������ ���� �÷����°��� CObj��
		pObj2.Init(); //Player ���� Init()�޼ҵ尡 �������̵� ���־ ��밡����
		
		
		CObj pObj3 = new Wizard(); //��ĳ����, �޸𸮴� Wizard ���� ������ Ÿ���� CObj��
		pObj3.Init();
		System.out.println();
		
		
		
		//�ٿ�ĳ����
		Player DpObj2 = (Player)pObj2;
		DpObj2.Init();
		DpObj2.Player();
		
		Wizard DpObj3 = (Wizard)pObj3;
		DpObj3.Init();
		DpObj3.Wizard();
		
	}

}
