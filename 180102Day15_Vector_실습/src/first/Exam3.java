package first;

import java.util.ArrayList;
import java.util.Scanner;

//4. Ű����� ���ڿ��� �Է� �޾� ArrayList�� �����ϰ� ���� ª�� �̸��� ����Ͻÿ�.
//[��ó] 2018-01-02 ���� �ʱ� (NCS�ڹ����α׷���&�������α׷���) |�ۼ��� �������

public class Exam3 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i<4) {
			System.out.print("�̸��� �Է��ϼ���:");
			a.add(sc.nextLine());
			i++;
		}
		int shortestIndex = 0;
		for(i=1;i<a.size();i++) {
			if(a.get(shortestIndex).length() > a.get(i).length());
			shortestIndex = i;
		}
		System.out.printf("����ª�� �̸��� %s",a.get(shortestIndex));
	}

}
