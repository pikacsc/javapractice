package ��ӿ���;
class SmartPhone{
	private String name;
	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//private �ϰ�� set����() �ش� private ������ �������ְ�
	//get����() �� �ش� ������ ���Ϲ����� �ְ��� 
	public void setName(String x) {
		this.name = x;   //this.����  this class(�ڱ� Ŭ����)���� �ִ� ����
	}
	
	public String getName() {
		return name;
	}
	
}

//public : ������ ������ �����ϰ� ���ش�.

//private : �ܺο��� ���Ұ�, private �������� �޼ҵ带 �̿��ؼ� �����ϰ� ��





public class Example_2 {

	public static void main(String[] args) {
		SmartPhone galaxy = new SmartPhone();
		galaxy.setName("ȫ�浿");
		System.out.println(galaxy.getName());
	}

}
