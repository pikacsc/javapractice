package �ٿ�ĳ����;

class DObject{
	void draw() {
		System.out.println("����");
	}
	
}


class Line extends DObject {
	@Override //������̼�
	void draw() {
		System.out.println("����");
	}
}

class Rectangle extends DObject{
	@Override //������̼�
	void draw() {
		System.out.println("�簢��");
	}
	
}



public class Example {

	public static void main(String[] args) {
//		DObject d = new DObject();
//		d.draw();
		
//		Line l = new Line();
//		l.draw();

//		DObject d = new Line(); //��ĳ����
//		d.draw(); //�������̵� �Ǽ� ������ ����̵�
//		
//		DObject d2 = new Rectangle();
//		d2.draw();//�������̵� �Ǽ� ������ ����̵�

		
		DObject d = new Line(); //��ĳ����
		Line l = (Line)d;//�ٿ�ĳ����
		
		DObject d2 = new Rectangle(); //��ĳ����
		Rectangle r = (Rectangle)d2; //�ٿ�ĳ����


		
		
	}

}
