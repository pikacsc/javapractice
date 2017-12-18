package test;

public class Array_3_3x3 {

	public static void main(String[] args) {
		
//	  3.  3행 3열 배열을 만들어서 아래처럼 출력하세요
//	      01 02 03
//	      04 05 06
//	      07 08 09
		
		int arr[][] = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		System.out.printf("%02d",arr[0][0]);
		System.out.printf(" %02d",arr[0][1]);
		System.out.printf(" %02d \n",arr[0][2]);
		
		System.out.printf("%02d",arr[1][0]);
		System.out.printf(" %02d",arr[1][1]);
		System.out.printf(" %02d \n",arr[1][2]);
		
		System.out.printf("%02d",arr[2][0]);
		System.out.printf(" %02d",arr[2][1]);
		System.out.printf(" %02d",arr[2][2]);
		
	}

}
