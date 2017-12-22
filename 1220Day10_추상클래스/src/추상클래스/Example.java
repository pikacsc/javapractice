package 추상클래스;
//abstract class DObject{//추상클래스
//	//추상메서드
//	abstract protected void draw(); //구현을 안함, 서브클래스들이 동적바인딩(오버라이딩)을 해서 구현하게함
//	//인스턴스 불가 ,new Dobject(); 불가능, 오직 업캐스팅으로만 인스턴스 생성 가능함 
//}

interface DObject{//추상클래스
	//추상메서드
	abstract void draw(); //구현을 안함, 서브클래스들이 동적바인딩(오버라이딩)을 해서 구현하게함
	//인스턴스 불가 ,new Dobject(); 불가능, 오직 업캐스팅으로만 인스턴스 생성 가능함 
}



class Line implements DObject{
	//ctrl+spacebar 누른뒤 A라고 작게 써진것이 abstract를 가리킴
	@Override
	void draw() {
		System.out.println("추상클래스에서 메소드 오버라이딩 해서 구현해봄 직선");
	}
}

class Rectangle implements DObject{
	
	@Override
	protected void draw() {
		System.out.println("추상클래스에서 메소드 오버라이딩 해서 구현해봄 사각형");
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
