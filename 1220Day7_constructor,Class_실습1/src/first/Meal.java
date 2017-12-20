package first;

import java.util.Scanner;

/*
 * 
 * 4. 태어나서 지금까지 내가 먹은 밥값이
    얼마나 되는지 계산 하는 프로그램을 
   작성하세요. 나이는 사용자로부터입력
   받고 하루 3끼 식사를 하되 한끼 식사
   5천원으로 계산하세요.
 */

public class Meal {

	public static void main(String[] args) {
		int age = 0;
		Meal m = new Meal();
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 :");
		age = sc.nextInt();
		System.out.printf("태어나서 지금까지 내가먹은 밥값은 %d원 입니다",m.mealCalculator(age));;
	}
	long mealCalculator(int age) {
		int meal = 5000;
		long 밥값=0;
		밥값=(meal*(age*365)*3l);
		return 밥값;
	}
}
