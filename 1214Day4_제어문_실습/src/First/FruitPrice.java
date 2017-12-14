package First;

import java.util.Scanner;

public class FruitPrice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fruit;
		int fruitCount;
		int 사과 = 1000;
		int 배 = 2000;
		int 딸기 = 500;
		int 귤 = 300;
		System.out.println("사과, 배, 딸기, 귤 팝니다");
		System.out.print("원하는 과일을 입력하세요:");
		fruit = sc.nextLine();	
		switch(fruit) {
		case ("사과"):
			System.out.println("1000원!");
			System.out.println("사과를 선택하셨습니다.");
			System.out.print("원하는 갯수를 입력하시오 : ");
			fruitCount = sc.nextInt();
			System.out.println("가격은 "+fruitCount*사과+"원 입니다.");
			
		break;
		case ("배"):
			System.out.println("2000원!");
			System.out.println("배를 선택하셨습니다.");
			System.out.print("원하는 갯수를 입력하시오 : ");
			fruitCount = sc.nextInt();
			System.out.println("가격은 "+fruitCount*배+"원 입니다.");
			
		break;
		case ("딸기"):
			System.out.println("500원!");
			System.out.println("딸기를 선택하셨습니다");
			System.out.print("원하는 갯수를 입력하시오 : ");
			fruitCount = sc.nextInt();
			System.out.println("가격은 "+fruitCount*딸기+"원 입니다.");		
		break;
		case ("귤"):
			System.out.println("300원!");
			System.out.println("귤을 선택하셨습니다.");
			System.out.print("원하는 갯수를 입력하시오 : ");
			fruitCount = sc.nextInt();
			System.out.println("가격은 "+fruitCount*귤+"원 입니다.");
		break;
		default:
			System.out.println("그런과일 없어!");
			break;
		}
		
		
	}

}
