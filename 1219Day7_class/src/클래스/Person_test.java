package 클래스;


class Coffee{
	int price;
	String taste;
	short shot;
	String name;
}


//↑위에 클래스를 쓸때는 동일 패키지에 속하므로 default(공백) 접근제어자를 사용 
public class Person_test {
	public static void main(String[] args) {
		Person_test pt = new Person_test();
		
		Person a; //클래스 타입으로 선언
		a = new Person(); //객체  생성. (인스턴스 생성) 
		
		
		a.name = "최성찬";
		a.age = 25;
		a.area = "경기";
		a.height = 176.7f;
		a.job = "web developer";
		a.weight = 65.8f;
		
		
		Person b = new Person();
	
		b.name = "홍길동";
		b.age = 42;
		b.area = "한양";
		b.height = 176.7f;
		b.job = "의적";
		b.weight = 75.8f;
		
		pt.printData(b);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Coffee 아메리카노 = new Coffee();
		
		아메리카노.name = "아메리카노";
		아메리카노.price = 2000;
		아메리카노.shot = 1;
		아메리카노.taste = "쓰다";
		
		pt.printData(아메리카노);
		
	}
	
	
	//↓메소드 오버로딩
	public void printData(Person x) {
		System.out.printf("이름은 %s입니다. \n",x.name);
		System.out.printf("나이는 %d살 이고 \n",x.age);
		System.out.printf("현재 %s 지역에 살고있으며 \n",x.area);
		System.out.printf("직업은 %s입니다. \n",x.job);
		System.out.printf("키는 %.1f 쯤 되고 \n",x.height);
		System.out.printf("몸무게는 %.1f 입니다. \n",x.weight);
		
	}
	public void printData(Coffee x) {
		System.out.printf("%s 커피를 사셨군요! \n",x.name);
		System.out.printf("가격은 %s원입니다. \n",x.price);
		System.out.printf("기본으로 %d샷 제공되고 \n",x.shot);
		System.out.printf("맛은 %s \n",x.taste);
		
	}

}
