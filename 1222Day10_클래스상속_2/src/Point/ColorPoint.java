package Point;

public class ColorPoint extends Point { //Point를 상속받은 ColorPoint 선언
	String color; //점의색
	void setColor(String color) {
		this.color = color;
	}
	
	void showColorPoint() { //컬러 점의 좌표 출력
		System.out.println(color);
		showPoint(); //Point 클래스의 showPoint()호출
	}
	
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); //Point 클래스의 set() 메소드 호출
		cp.setColor("red"); //색지정
		cp.showColorPoint(); //컬러점의 좌표
		
	}
}
