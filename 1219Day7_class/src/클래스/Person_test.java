package Ŭ����;


class Coffee{
	int price;
	String taste;
	short shot;
	String name;
}


//������ Ŭ������ ������ ���� ��Ű���� ���ϹǷ� default(����) ���������ڸ� ��� 
public class Person_test {
	public static void main(String[] args) {
		Person_test pt = new Person_test();
		
		Person a; //Ŭ���� Ÿ������ ����
		a = new Person(); //��ü  ����. (�ν��Ͻ� ����) 
		
		
		a.name = "�ּ���";
		a.age = 25;
		a.area = "���";
		a.height = 176.7f;
		a.job = "web developer";
		a.weight = 65.8f;
		
		
		Person b = new Person();
	
		b.name = "ȫ�浿";
		b.age = 42;
		b.area = "�Ѿ�";
		b.height = 176.7f;
		b.job = "����";
		b.weight = 75.8f;
		
		pt.printData(b);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Coffee �Ƹ޸�ī�� = new Coffee();
		
		�Ƹ޸�ī��.name = "�Ƹ޸�ī��";
		�Ƹ޸�ī��.price = 2000;
		�Ƹ޸�ī��.shot = 1;
		�Ƹ޸�ī��.taste = "����";
		
		pt.printData(�Ƹ޸�ī��);
		
	}
	
	
	//��޼ҵ� �����ε�
	public void printData(Person x) {
		System.out.printf("�̸��� %s�Դϴ�. \n",x.name);
		System.out.printf("���̴� %d�� �̰� \n",x.age);
		System.out.printf("���� %s ������ ��������� \n",x.area);
		System.out.printf("������ %s�Դϴ�. \n",x.job);
		System.out.printf("Ű�� %.1f �� �ǰ� \n",x.height);
		System.out.printf("�����Դ� %.1f �Դϴ�. \n",x.weight);
		
	}
	public void printData(Coffee x) {
		System.out.printf("%s Ŀ�Ǹ� ��̱���! \n",x.name);
		System.out.printf("������ %s���Դϴ�. \n",x.price);
		System.out.printf("�⺻���� %d�� �����ǰ� \n",x.shot);
		System.out.printf("���� %s \n",x.taste);
		
	}

}
