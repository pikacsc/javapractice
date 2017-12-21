package 상속연습;
class SmartPhone{
	private String name;
	private int price;
	
	//private 일경우 set변수() 해당 private 변수를 수정해주고
	//get변수() 로 해당 변수를 리턴받을수 있게함 
	public void setName(String x) {
		name = x;
	}
	
	public String getName() {
		return name;
	}
	
}

//public : 누구나 접근이 가능하게 해준다.

//private : 외부에서 사용불가, private 변수들은 메소드를 이용해서 접근하게 함





public class Example_2 {

	public static void main(String[] args) {
		SmartPhone galaxy = new SmartPhone();
		galaxy.setName("홍길동");
		System.out.println(galaxy.getName());
	}

}
