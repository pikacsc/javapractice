package first;

import java.util.Scanner;

/*
 * 1.��ȭ��ȣ(010-1234-5678)���� ����(010)�� �����Ͻÿ�.

2.��ȭ��ȣ(010-1234-5678)���� '-'�� �����Ͻÿ�.
=>01012345678 �� �����ϱ�

3. ��ǰ�ڵ�(E20160001)���� ��ǰī�װ�('E')�� �����Ͻÿ�.

4. ��ǰ�ڵ�(E20160001)���� �⵵('2016')�� �����Ͻÿ�.

5. �ּҷ� ���ڿ��� �и��Ͻÿ�.
ȫ�浿,010-1111-2222,hkd@hkd.com

 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("010-xxxx-xxxx ó�� ��ȭ��ȣ�� �Է��ϼ���");
		String pn = sc.nextLine();
		System.out.println("��ǰ�ڵ带 E2016XXXX�� �Է��ϼ���: ");
		String code = sc.nextLine();
		String ps = "ȫ�浿,010-1111-2222,hkd@hkd.com";

			System.out.println("1.��ȭ��ȣ(010-1234-5678)���� ����(010)�� �����Ͻÿ�.");
			PCodeExtrac_2 PC2 = new PCodeExtrac_2();
			System.out.println(PC2.Extrac010(pn));
			
			
			System.out.println("2.��ȭ��ȣ(010-1234-5678)���� '-'�� �����Ͻÿ�.");
			System.out.println(PC2.removeH(pn));
			System.out.println();
			
			System.out.println("3. ��ǰ�ڵ�(E20160001)���� ��ǰī�װ�('E')�� �����Ͻÿ�.");
			System.out.println(PC2.Extrac_1(code));
			System.out.println();
			
			System.out.println("4. ��ǰ�ڵ�(E20160001)���� �⵵('2016')�� �����Ͻÿ�.");
			System.out.println(PC2.Extrac2(code));
			System.out.println();
			
			System.out.println("5. �ּҷ� ���ڿ��� �и��Ͻÿ�.");
			String ps2[] = ps.split(",");
			for(int i=0;i<3;i++) {
				System.out.println(ps2[i]);	
			}
		}
}


