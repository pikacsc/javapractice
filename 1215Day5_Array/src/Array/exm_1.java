package Array;

public class exm_1 {

	public static void main(String[] args) {
		// �ڷ��� �迭�̸�[��ҹ�ȣ]  ||  �ڷ��� [��ҹ�ȣ] �迭�̸�
		
		// ���� ���� ��� �迭�� 3�� ũ�⸸ŭ �����ϰڴ�.
//		int arr[] = new int[3]; 
		
		// ���ڿ� ���� ��� �迭 100�� ũ�⸸ŭ ���� �ϰڴ�
		String arr2[] = new String[100];
		
		//�迭�� 0������ ����
//		arr[0]  = 1; // �迭 arr 0��°�� 1 �� �Ҵ�
//		arr[1]  = 2; // �迭 arr 1��°�� 2 �� �Ҵ�
//		arr[2]  = 3; // �迭 arr 2��°�� 3 �� �Ҵ�
//		
		
		                 //���� �ٷ� �Ҵ��ؼ� ũ�⼱�� ����
//	    int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//
//		System.out.println(arr[2]);
//		System.out.println(arr[6]);
//		System.out.println(arr[7]);

						//���ڿ� �Է� �Ҷ� ����ǥ �������� ��ǥ ��� �迭 �ϰ� ���� �Ҷ� ó�� �翷�� �߰�ȣ 
		String str[] = {"Hello","Java","Nice to meet you","Bye!"};
		
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		String str2[] = new String[4];
 		
		
		//���������� ��� �翷�� �߰�ȣ ����
		str2[0] = "�ȳ��ϼ���";
		str2[1] = "����������";
		str2[2] = "�Ƴ�";
		str2[3] = "������";
		
		
		System.out.println(str2[0]+str2[1]);
		
		
		int numb = 3;     //���ȣ�ȿ� ���ڴ�ſ� int ���������ε� ��������
		System.out.println(str2[numb]);
		
 	} 

}
