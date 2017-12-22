package 다운캐스팅;

class DObject{
	void draw() {
		System.out.println("도형");
	}
	
}


class Line extends DObject {
	@Override //어노테이션
	void draw() {
		System.out.println("라인");
	}
}

class Rectangle extends DObject{
	@Override //어노테이션
	void draw() {
		System.out.println("사각형");
	}
	
}



public class Example {

	public static void main(String[] args) {
//		DObject d = new DObject();
//		d.draw();
		
//		Line l = new Line();
//		l.draw();

//		DObject d = new Line(); //업캐스팅
//		d.draw(); //오버라이딩 되서 라인이 출력이됨
//		
//		DObject d2 = new Rectangle();
//		d2.draw();//오버라이딩 되서 라인이 출력이됨

		
		DObject d = new Line(); //업캐스팅
		Line l = (Line)d;//다운캐스팅
		
		DObject d2 = new Rectangle(); //업캐스팅
		Rectangle r = (Rectangle)d2; //다운캐스팅


		
		
	}

}
