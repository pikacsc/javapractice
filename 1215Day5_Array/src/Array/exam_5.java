package Array;

public class exam_5 {
	public static void main(String[] args) {
		//������ �迭
		//�� ���� ���� ������ ���� �迭
		//int a[2][3];
		
		//�������� �迭
		//�� ���� ���� ������ �ٸ� �迭
		//�������� �迭�� ����
		int i[][];
		i = new int[4][];
		i[0] = new int[1];        
		i[1] = new int[2];
		i[2] = new int[3];
		i[3] = new int[4];
		
		/*   ��
		 * 
		 * 
		 *   i[0][0]
		 *   i[1][0]  i[1][1]
		 *   i[2][0]  i[2][1]  i[2][2]
		 *   i[3][0]  i[3][1]  i[3][2]  i[3][3]
		 */
		
		
		
		
		System.out.println(i.length); // 2���� ���� ���� 4
		System.out.println(i[0].length); // 0��°�� ���� ���� ���� 1
		System.out.println(i[1].length); // 1��°�� ���� ���� ���� 2
 		System.out.println(i[2].length); // 2��°�� ���� ���� ���� 3
		System.out.println(i[3].length); // 3��°�� ���� ���� ���� 4
		
	}
}
