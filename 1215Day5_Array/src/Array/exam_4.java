package Array;

public class exam_4 {
	public static void main(String[] args) {
//		����1
//		int intArray[];
//		intArray[4] = 8;
//		�ݵ�� �迭 ������ �޸𸮵� �־��ְ� ���� �־�� �Ѵ�.
		
//		����
//		int intArray[];
//		intArray = new int[10];
//		
//		intArray[4] = 8;
//		System.out.println(intArray[4]);
		
		
//		����2 �� �ش�
//		int intArray[] = new int[5]; // �ε����� 0~4���� ����
//		int n = intArray[-2];  //�ε����� -�� ������ ����
//		
//		System.out.println(n);
//		
		
		//�迭.length �� ������ �˾Ƴ���
		String []line = {"as","fa","sfd","fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas",
				"fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas",};
		int size = line.length;

		System.out.println(size);
		
		
		
		int i[][] = new int[2][5];
		int size1 = i.length; //2
		int size2 = i[0].length; //5
		int size3 = i[1].length; //5
		
		System.out.println(size1); // 2���� �迭�� ���� ����
		System.out.println(size2); // 0��° ���� �������� ����
		System.out.println(size3); // 1��° ���� �������� ����
		
		
		
		
		
		
	}
}
