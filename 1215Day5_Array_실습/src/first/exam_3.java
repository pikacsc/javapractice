package first;

public class exam_3 {
	public static void main(String[] args) {
//		3. 3행3열 배열을 만들어서
//		   아래처럼 출력하세요.
//		   01 02 03
//		   04 05 06
//		   07 08 09
//		
		
		String array[][] = {{"01","02","03"},{"04","05","06"},{"07","08","08"}};
//		System.out.printf(array[0][0]);
//		System.out.printf(array[1][0]);
//		System.out.printf(array[2][0]);
//		
		String a = array[0][0];
		
		System.out.printf("%-3s", array[0][0]);
		System.out.printf("%-3s", array[0][1]);
		System.out.printf("%s \n",array[0][2]);
		
		System.out.printf("%-3s", array[1][0]);
		System.out.printf("%-3s", array[1][1]);
		System.out.printf("%s \n",array[1][2]);
		
		System.out.printf("%-3s", array[2][0]);
		System.out.printf("%-3s", array[2][1]);
		System.out.printf("%s \n",array[2][2]);
		
	}

}
