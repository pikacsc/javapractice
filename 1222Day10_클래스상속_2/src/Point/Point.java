package Point;

public class Point {
	int x,y; //한점을 구성하는 x,y좌표
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {//점의 좌표 출력
		System.out.printf("x= %d, y=%d \n",x,y);
	}
}
