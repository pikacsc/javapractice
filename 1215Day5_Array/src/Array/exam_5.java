package Array;

public class exam_5 {
	public static void main(String[] args) {
		//정방향 배열
		//각 행의 열의 갯수가 같은 배열
		//int a[2][3];
		
		//비정방형 배열
		//각 행의 열의 갯수가 다른 배열
		//비정방형 배열의 생성
		int i[][];
		i = new int[4][];
		i[0] = new int[1];        
		i[1] = new int[2];
		i[2] = new int[3];
		i[3] = new int[4];
		
		/*   ↓
		 * 
		 * 
		 *   i[0][0]
		 *   i[1][0]  i[1][1]
		 *   i[2][0]  i[2][1]  i[2][2]
		 *   i[3][0]  i[3][1]  i[3][2]  i[3][3]
		 */
		
		
		
		
		System.out.println(i.length); // 2차원 행의 갯수 4
		System.out.println(i[0].length); // 0번째의 행의 열의 갯수 1
		System.out.println(i[1].length); // 1번째의 행의 열의 갯수 2
 		System.out.println(i[2].length); // 2번째의 행의 열의 갯수 3
		System.out.println(i[3].length); // 3번째의 행의 열의 갯수 4
		
	}
}
