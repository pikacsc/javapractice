package 반복문과클래스;

import java.util.Scanner;

class ScoreDTO{
	String iName = "";
	int iKor = 0;
	int iEng = 0;
	int iMath = 0;
	
}

public class LoopEx {

	public static void main(String[] args) {
		LoopEx main = new LoopEx();
		String []ST = {"student1","student2","student3","student4","student5"};
		
		
		//5명의 학생의 국어점수 수학점수 영어점수를 입력받기
		//배열,반복문으로 객체생성하기
		for(int i =0;i<5;i++) {
			ScoreDTO student[] = new ScoreDTO[i];
			main.inputScore(student[i]);
			main.printScore(student[i]);
		}
		

		
		
		//반복문
		
	}
	void inputScore(ScoreDTO x) {
		Scanner sc = new Scanner(System.in);
			System.out.print("학생이름 입력하세요 : ");
			x.iName = sc.nextLine();
			System.out.print("국어점수를 입력하세요 : ");
			x.iKor = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			x.iEng = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			x.iMath = sc.nextInt();
			System.out.println();
	}
	void printScore(ScoreDTO x) {
		String 이름 = x.iName;
		int 국어 = x.iKor;
		int 영어 = x.iEng;
		int 수학 = x.iMath;
				
		System.out.printf("학생이름: %s \n",이름);
		System.out.printf("국어: %s \n",국어);
		System.out.printf("수학: %s \n",수학);
		System.out.printf("영어: %s \n",영어);
		
	}

}
