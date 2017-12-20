package 생성자;

public class Person2 {
	String name;
	int age;
	
	
	//함수(메소드)의 이름(시그니쳐)가 같고 매개변수, 인자갯수가 다르면
	//함수(메소드) 오버로딩
	
	//기본생성자 안만들면 자동으로 만들어진다
	Person2() {
		name = "철수";
		age = 17;
	}
	
	//매개변수 있는 생성자(수동으로 만들어줘야됨)
	Person2(String sName,int iAge) {
		name = sName;
		age = iAge;
	}

}
