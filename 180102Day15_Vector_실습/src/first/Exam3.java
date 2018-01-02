package first;

import java.util.ArrayList;
import java.util.Scanner;

//4. 키보드로 문자열을 입력 받아 ArrayList에 삽입하고 가장 짧은 이름을 출력하시오.
//[출처] 2018-01-02 문제 초급 (NCS자바프로그래밍&게임프로그래밍) |작성자 헤이즐넛

public class Exam3 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i<4) {
			System.out.print("이름을 입력하세요:");
			a.add(sc.nextLine());
			i++;
		}
		int shortestIndex = 0;
		for(i=1;i<a.size();i++) {
			if(a.get(shortestIndex).length() > a.get(i).length());
			shortestIndex = i;
		}
		System.out.printf("가장짧은 이름은 %s",a.get(shortestIndex));
	}

}
