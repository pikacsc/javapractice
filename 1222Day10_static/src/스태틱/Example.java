package 스태틱;

class Book{
	String name;
	static int price; 
	static int count;
	Book(){
		count++;
	}
	
	void printInfo() {
		System.out.printf("name : %s \n",name);
		System.out.printf("price : %d \n",price);
		System.out.println();
	}
	
}





public class Example {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		Book b2 = new Book();
		
		
		b1.name = "Java";
		b2.name = "C";
		
		b1.price = 10000;
		b2.price = 15000; //price 변수는 static이 앞에 붙어있어서 전역변수
		
		b1.printInfo();
		b2.printInfo();
		
		System.out.printf("몇개생성 되었냐 %d \n",b2.count);
		Book.count = 3; //클래스에서 static 메모리 부분이 따로있기떄문에 항상 존재함
		System.out.println("수정후 변한 count: "+b2.count);
	}

}
