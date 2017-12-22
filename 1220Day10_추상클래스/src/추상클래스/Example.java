package �߻�Ŭ����;
//abstract class DObject{//�߻�Ŭ����
//	//�߻�޼���
//	abstract protected void draw(); //������ ����, ����Ŭ�������� �������ε�(�������̵�)�� �ؼ� �����ϰ���
//	//�ν��Ͻ� �Ұ� ,new Dobject(); �Ұ���, ���� ��ĳ�������θ� �ν��Ͻ� ���� ������ 
//}

interface DObject{//�߻�Ŭ����
	//�߻�޼���
	abstract void draw(); //������ ����, ����Ŭ�������� �������ε�(�������̵�)�� �ؼ� �����ϰ���
	//�ν��Ͻ� �Ұ� ,new Dobject(); �Ұ���, ���� ��ĳ�������θ� �ν��Ͻ� ���� ������ 
}



class Line implements DObject{
	//ctrl+spacebar ������ A��� �۰� �������� abstract�� ����Ŵ
	@Override
	void draw() {
		System.out.println("�߻�Ŭ�������� �޼ҵ� �������̵� �ؼ� �����غ� ����");
	}
}

class Rectangle implements DObject{
	
	@Override
	protected void draw() {
		System.out.println("�߻�Ŭ�������� �޼ҵ� �������̵� �ؼ� �����غ� �簢��");
	}
}



public class Example {

	public static void main(String[] args) {
		
		
		 Line l = new Line();
		 l.draw();
		 
		 DObject d = new Line();
		 d.draw();
		 
	}

}
