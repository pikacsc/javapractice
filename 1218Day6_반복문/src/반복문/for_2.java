package �ݺ���;

public class for_2 {

	public static void main(String[] args) {
		// ������ for��
		// c#�� foreach�� �� ������ ����
		int[] myArr = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		//for( int i: �迭)  == int i �� �迭�� ����
		for(int i : myArr) {
			sum += i;
		}
	}

}
