package second;

public class exam_1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1. �������� ����� 
2 x 1 = 1 2 x 2 = 4 .......2 x 9 = 18
3 x 1 = 3 3 x 2 = 6 ......
4 x 1 = 4 4 x 2 = 8 ......
����� ���η� ������ּ���.
[��ó] �ڹ� 6���� ���� �߱� (NCS�ڹ����α׷���&�������α׷���) |�ۼ��� �������
		 * 
		 */
		for(int x=2;x<=9;x++) {
			for(int y=1;y<=9;y++) {
				System.out.printf("%s x %s = %s ",x,y,x*y);
			}
			System.out.println();
		}
		
		
	}

}
