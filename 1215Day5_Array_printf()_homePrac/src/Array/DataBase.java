package Array;

import java.util.Scanner;

public class DataBase {

	public static void main(String[] args) {
		//4. 회원정보를 문자열 배열로 입력받고 출력해보세요.
		//		   이름,주소,직업,나이
		DataBase DB = new DataBase();
		DB.inputDB();
	}

	public void inputDB() {
		Scanner sc = new Scanner(System.in);
		String []lines = {"이름을 입력하세요 :","주소를 입력하세요 :","직업을 입력하세요 :","나이를 입력하세요 :"};
		String [][]table = new String [5][5];
		int x = 0, y = 0;
			for(int i=0;i<5;i++) {
				if(i==4) {
					break;
					}
			System.out.print(lines[i]);
			String input = sc.nextLine();
			table[x][y] = input;
			System.out.println(table[x][y]);
			y++;
			}
	}

}
