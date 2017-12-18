package 반복문;

public class for_2 {

	public static void main(String[] args) {
		// 개선된 for문
		// c#의 foreach문 과 유사한 형식
		int[] myArr = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		//for( int i: 배열)  == int i 는 배열의 개수
		for(int i : myArr) {
			sum += i;
		}
	}

}
