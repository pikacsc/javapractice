package ��ӿ���;
class SmartPhone{
	private String name;
	private int price;
	
	//private �ϰ�� set����() �ش� private ������ �������ְ�
	//get����() �� �ش� ������ ���Ϲ����� �ְ��� 
	public void setName(String x) {
		name = x;
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
