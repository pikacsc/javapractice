package first;

public class exam_2 {

	public static void main(String[] args) {
//		2. while���� �̿��ؼ� 1���� 10���� ���� ���� ����Ͻÿ�.
		int i = 0;
		int sum = 0;
		while(i<=10) {
			i++;
			sum += i;
			if(i==10) {
				System.out.printf("1���� 10������ ���� %s �Դϴ�.",sum);
				break;
			}
		}
		
	}

}
