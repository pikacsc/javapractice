package casting;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class DataType {

	public static void main(String[] args) {
	//byte < short < int < long < float < double
	// ���� �������� ū������ �ڷ��� ��ȯ�� ���������� �����ϴ�.
	// ū���� ������ Ÿ�Կ��� ���� ���� ������ Ÿ������ ��ȯ�� �ǰ� ���鶧 Casting �̶�°� �ؾߵȴ�.
	// �Ҽ����ִ� ������ Ÿ�Ե��� ���� �Ҽ����κ��� ���� ©���� �ִ�
		int a = 10;
		
		double d = a;
		
		System.out.println("a���� "+a);
		System.out.println("d���� "+d);
		System.out.println("");
		double d2 = 3.14;
		int b = (int) d2;
		System.out.println("b���� "+b);
		
	
		/*
		 * Casting ���
		 *�������� ������Ÿ��  ������ = (��ȯ�� ������ Ÿ��) ������; 
		 *
		 * 
		 * int b = d2; �ҽ� ������ ��
		 */
	}

}
