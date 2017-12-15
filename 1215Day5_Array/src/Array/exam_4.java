package Array;

public class exam_4 {
	public static void main(String[] args) {
//		문제1
//		int intArray[];
//		intArray[4] = 8;
//		반드시 배열 생성후 메모리도 넣어주고 값을 주어야 한다.
		
//		정답
//		int intArray[];
//		intArray = new int[10];
//		
//		intArray[4] = 8;
//		System.out.println(intArray[4]);
		
		
//		문제2 및 해답
//		int intArray[] = new int[5]; // 인덱스는 0~4까지 가능
//		int n = intArray[-2];  //인덱스에 -는 붙을수 없음
//		
//		System.out.println(n);
//		
		
		//배열.length 로 사이즈 알아내기
		String []line = {"as","fa","sfd","fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas",
				"fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas","fas","dfa","sd","fas",};
		int size = line.length;

		System.out.println(size);
		
		
		
		int i[][] = new int[2][5];
		int size1 = i.length; //2
		int size2 = i[0].length; //5
		int size3 = i[1].length; //5
		
		System.out.println(size1); // 2차월 배열의 행의 갯수
		System.out.println(size2); // 0번째 행의 열에대한 갯수
		System.out.println(size3); // 1번째 행의 열에대한 갯수
		
		
		
		
		
		
	}
}
