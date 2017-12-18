package first;

public class exam_1 {

	public static void main(String[] args) {
//		1. for문을 이용해서 1부터 10까지 수를 출력하시오.
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
			if(i==10) System.out.printf("1부터 10까지의 합은 %s입니다",sum);;
		}
	}

}
