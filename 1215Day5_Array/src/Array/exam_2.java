package Array;

public class exam_2 {
	public static void main(String[] args) {
		//2차원적 배열
		int arr[][] =  new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		int x = 0;
		int y = 0;
		System.out.println("arr[0][0]=="+arr[x][y++]);
		System.out.println("arr[0][1]=="+arr[x][y++]);
		System.out.println("arr[0][2]=="+arr[x][y++]);
		x = 0;
		y = 0;
		System.out.println("arr[1][0]=="+arr[x+1][y++]);
		System.out.println("arr[1][1]=="+arr[x+1][y++]);
		System.out.println("arr[1][2]=="+arr[x+1][y++]);
		x = 0;
		y = 0;
		int arr2[][] = {{1,2,3},{1,2,3}};
		System.out.println("arr2[0][0]=="+arr2[x][y++]);
		System.out.println("arr2[0][1]=="+arr2[x][y++]);
		System.out.println("arr2[0][2]=="+arr2[x][y++]);
		x = 0;
		y = 0;
		System.out.println("arr2[1][0]=="+arr2[x+1][y++]);
		System.out.println("arr2[1][1]=="+arr2[x+1][y++]);
		System.out.println("arr2[1][2]=="+arr2[x+1][y++]);
		
		
	}
}
