package 단팥죽;

import java.util.Scanner;


public class Main {
	public static void main(String []args) {
									//[컬럼][팥죽이름]
		Scanner sc2 = new Scanner(System.in);
		String 팥죽테이블[][] = new String[4][6];
		Main m = new Main();
		int i = 0;
		단팥죽 test = new 단팥죽();
		//팥죽테이블[0][0] = 이름 = x.name
		//팥죽테이블[1][0] = 가격 = x.price
		//팥죽테이블[2][0] = 용량 = x.weight
		//팥죽테이블[3][0] = 제조나라 = x.madein
			
		
		for(int y=0;y<6;y++) {
			for(int x=0;x<4;x++) {
				switch(x) {
				case 0:
					System.out.printf("\n %d번째 단팥죽의 이름을 입력하세요: ",y);
					팥죽테이블[x][y] = sc2.next();
					break;
				case 1:
					System.out.printf("단팥죽의 가격을 입력하세요: ");
					팥죽테이블[x][y] = ""+sc2.nextInt();
					break;
				case 2:
					System.out.printf("단팥죽의 용량(g)을 입력하세요 ,단위생략: ");
					팥죽테이블[x][y] = ""+sc2.nextInt(); 
					break;
				case 3:
					System.out.printf("단팥죽 제조나라에 맞는 번호를 입력하세요 "
							+ "1.한국"
							+ "2.중국"
							+ ": ");
					test.madein = sc2.nextByte(); 
					if(test.madein==1) {
						팥죽테이블[x][y]="한국";
						break;
					}else {
						팥죽테이블[x][y]="중국";
						break;
					}
				}
			}
		}
		
		m.printData(팥죽테이블);
	}
	
//	void inputData(단팥죽 x) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("단팥죽의 이름을 입력하세요: ");
//		x.name = sc.next(); 
//		
//		System.out.print("단팥죽의 가격을 입력하세요: ");
//		x.price = sc.nextInt(); 
//		
//		System.out.print("단팥죽의 용량(g)을 입력하세요 ,단위생략: ");
//		x.weight = sc.nextInt(); 
//
//		System.out.print("단팥죽 제조나라에 맞는 번호를 입력하세요 "
//				+ "1.한국"
//				+ "2.중국"
//				+ ": ");
//		x.madein = sc.nextByte(); 
//	}
//	
	void printData(String[][] 팥죽테이블) {
		for(int y=0;y<6;y++) {
			for(int x=0;x<4;x++)
				switch(x) {
				case 0:
					System.out.printf("\n %d번째 단팥죽 이름: %s \n",y,팥죽테이블[x][y]);
					break;
				case 1:
					System.out.printf("가격: %s \n",y,팥죽테이블[x][y]);
					break;
				case 2:
					System.out.printf("용량: %s \n",y,팥죽테이블[x][y]);
					break;				
				case 3:
					if(팥죽테이블[x][y].equals("한국")) {
						System.out.println("제조사 한국");
						break;
					}else {
						System.out.println("제조사 중국");
						break;  
					}
				}
		}
	}

}
