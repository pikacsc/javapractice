package test;

public class Array_5 {

	public static void main(String[] args) {
//		5.비정방형 배열 사용하여 2차원 배열을 만들고 
//		  출력을 해보세요.
//		  10 11 12
//		  20 21
//		  30 31 32
//		  40 41
		int arr[][] = new int[4][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[2];
		
		arr[0][0] = 10;
		arr[0][1] = 11;
		arr[0][2] = 12;
		arr[1][0] = 20;
		arr[1][1] = 21;
		arr[2][0] = 30;
		arr[2][1] = 31;
		arr[2][2] = 32;
		arr[3][0] = 40;
		arr[3][1] = 41;
				
		System.out.printf("%2d %2d %2d",arr[0][0],arr[0][1],arr[0][2]);
		System.out.println();
		System.out.printf("%2d %2d ",arr[1][0],arr[1][1]);
		System.out.println();
		System.out.printf("%2d %2d %2d",arr[2][0],arr[2][1],arr[2][2]);
		System.out.println();
		System.out.printf("%2d %2d",arr[3][0],arr[3][1]);
		
	}

}
