package Array;

import java.util.Scanner;

public class DataBase {

	public static void main(String[] args) {
		//4. ȸ�������� ���ڿ� �迭�� �Է¹ް� ����غ�����.
		//		   �̸�,�ּ�,����,����
		DataBase DB = new DataBase();
		DB.inputDB();
	}

	public void inputDB() {
		Scanner sc = new Scanner(System.in);
		String []lines = {"�̸��� �Է��ϼ��� :","�ּҸ� �Է��ϼ��� :","������ �Է��ϼ��� :","���̸� �Է��ϼ��� :"};
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
