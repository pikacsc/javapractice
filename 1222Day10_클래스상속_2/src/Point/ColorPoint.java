package Point;

public class ColorPoint extends Point { //Point�� ��ӹ��� ColorPoint ����
	String color; //���ǻ�
	void setColor(String color) {
		this.color = color;
	}
	
	void showColorPoint() { //�÷� ���� ��ǥ ���
		System.out.println(color);
		showPoint(); //Point Ŭ������ showPoint()ȣ��
	}
	
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); //Point Ŭ������ set() �޼ҵ� ȣ��
		cp.setColor("red"); //������
		cp.showColorPoint(); //�÷����� ��ǥ
		
	}
}
