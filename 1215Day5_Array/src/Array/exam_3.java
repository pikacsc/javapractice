package Array;

public class exam_3 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		
		//������ �ϳ��� �迭�� �ټ��� ���۷����� ���� ����
		
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		
		// �迭�� ��°�� ����, myArray[]�� intArray�� ��°�� ����
		int myArray[] = intArray;
		
		//myArray[1] ���� �ʱ�ȭ
		myArray[1] = 10;
		
		
		//�׷��� intArray ������ �ٲ�� �˼� ����
		//��� myArray[] = intArray; �Ҷ����� myArray[] �� intArray ��  ����ȭ���Ȱ� 
		System.out.println("myArray[1]="+myArray[1]);
		System.out.println("intArray[1]="+intArray[1]);
		System.out.println("myArray[4]="+myArray[4]);
		
		
		
		int a[] = {1,2,3};
		int b[] = new int[3];
		
		//�迭�� ���ϰ��� ����
		b[1] = a[1];
		
		//b[1]�� �ٲ�� �˼� ����
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	}

}
