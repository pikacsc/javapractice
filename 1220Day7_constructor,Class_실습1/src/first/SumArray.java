package first;

import java.util.Scanner;

/*
 * 1. ũ�Ⱑ 10�� �迭�� ���� 10���� ������ ���� ��ü �հ踦
    ����Ͻÿ�. for�� ���
2. 1�������� ���� for������ ����Ͻÿ�.
 */

/**
 * 1�� 
class InputArray{
	Scanner sc = new Scanner(System.in);
	
	
	void input(int �迭[]) {
		int sum = 0;
		for(int x=0;x<10;x++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� ",x+1);
			�迭[x] = sc.nextInt();
			sum += �迭[x];
		}
		System.out.println();
		System.out.printf("�հ�� %d",sum);
	}
	

}
public class SumArray {
	public static void main(String []args) {
		InputArray input = new InputArray();
		int sum =0;
		int []arr = new int[10];
		
		input.input(arr);
		
	}
	
		
}

 */

//2
class InputArray{
	Scanner sc = new Scanner(System.in);
	
	
	void input(int �迭[]) {
		int sum = 0;
		int index = 1;
		for(int x:�迭) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� ",index++);
			�迭[x] = sc.nextInt();
			sum += �迭[x];
			
		}
		System.out.println();
		System.out.printf("�հ�� %d",sum);
	}
	

}
public class SumArray {
	public static void main(String []args) {
		InputArray input = new InputArray();
		int sum =0;
		int []arr = new int[10];
		
		input.input(arr);
		
	}
	
		
}


	

