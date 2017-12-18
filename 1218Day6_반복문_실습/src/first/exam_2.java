package first;

public class exam_2 {

	public static void main(String[] args) {
//		2. while문을 이용해서 1부터 10까지 수의 합을 출력하시오.
		int i = 0;
		int sum = 0;
		while(i<=10) {
			i++;
			sum += i;
			if(i==10) {
				System.out.printf("1부터 10까지의 합은 %s 입니다.",sum);
				break;
			}
		}
		
	}

}
