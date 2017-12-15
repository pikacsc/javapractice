package first;

public class exam_5 {
	public static void main(String[] args) {
//		5. 비정방형 배열 사용하여 2차원 배열을 만들고 
//		   출력을 해보세요.
//		   10 11 12
//		   20 21
//		   30 31 32
//		   40 41
//		
		
		
		int[][] array= {{10,11,12},{20,21},{30,31,32},{40,41}};
		System.out.printf("%-3d", array[0][0]);
		System.out.printf("%-3d", array[0][1]);
		System.out.printf("%s \n",array[0][2]);
		
		System.out.printf("%-3d", array[1][0]);
		System.out.printf("%s \n",array[1][1]);
		
		System.out.printf("%-3d", array[2][0]);
		System.out.printf("%-3d", array[2][1]);
		System.out.printf("%d \n",array[2][2]);
		
		System.out.printf("%-3d", array[3][0]);
		System.out.printf("%-3d", array[3][1]);
		
	}
}
