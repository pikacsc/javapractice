package ��Ʈ����ü;

public class Exam {

	public static void main(String[] args) {
		String s = "ȫ�浿";
		String str = new String("�̼���");
		
		System.out.println(s);
		System.out.println(str);
		
		String a = "         hello World                  ";
		System.out.println(a.length());// String.length ���ڿ��� ����(��������)
		
		String s1 = a.trim(); // �յ� ���� ����
		System.out.printf("%s %s \n",s1,s1.length());
		
		String filename ="movie.jpg";
		for(int i =0; i<filename.length();i++) {    //������ ��ġ�� ���ڿ����� ���ϱ�
			if(filename.charAt(i)=='.') {
				System.out.println("���� ��ġ: "+i);
			}
		}
		
		//��ǰ�ڵ�, f00001(f: food) e001(e:electronic)
		
		String goodsCode = "f0001";
		if(goodsCode.charAt(0)=='f') {
			System.out.println("food�Դϴ�.");
		}
		else if(goodsCode.charAt(0)=='e') {
			System.out.println("electronic �Դϴ�");
		}
		
		String goodsCode2 = goodsCode.replace("f", "l"); //String.replace("a","b") String�� ���ڿ� a�� b�� �ٲ���
		System.out.println(goodsCode2);
		
		System.out.println();
		System.out.println(filename.replace("jpg", "gif")); //�̷������� �ϸ� ������ �ٲ��� ����
		System.out.println(filename);//����
		
		System.out.println();
		String id ="hkd";
		String name ="ȫ�浿";
		String job = "����";
		String data = id+","+name+","+job;
		System.out.println(data);
		
		String result[] = data.split(","); //String.split("x")���ڿ��ȿ� x�� �ִٸ� x�� �����Ͽ� ¥���� result[]�迭�� �ֱ� 
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		System.out.println();
		
		 String result2[] = filename.split("\\."); // �޸��� ��������� . ���� �齽���� \\�� �ٿ������
		 for(int i=0;i<result2.length;i++) {
			 System.out.println(result2[i]);
		 }
		
		 System.out.println();
		 
		 //�ֹε�Ϲ�ȣ���� �޺κ� ���ϱ�
		 String �ֹι�ȣ = "8029341187510";
		 System.out.println(�ֹι�ȣ.substring(6));//���ڿ�.substring(����),���ڿ����� ù���ڸ� 0���� ������ ���ڸ�ŭ�� �ڸ����� ���� 
		 										//���ڿ��� ��������
		 System.out.println(�ֹι�ȣ.substring(0,6));//���ڿ�.substring(����1,����2),���ڿ����� ù���ڸ� ����1�� ������ ����2��ŭ�� �ڸ����� ������ 
			//���ڿ��� ��������
		 
		 
		 String text = "abcd";
		 System.out.println(text.toUpperCase());//String.toUppercase�ҹ��ڸ� �빮�ڷ� 
		 String text2 = "ABCD";
		 System.out.println(text2.toLowerCase());//String.toLowercase�빮�ڸ� �ҹ��ڷ�
		 
		 //���ڿ� �������� ����ϱ�
		 StringBuffer text3 = new StringBuffer("abcd"); //StringBuffer ��ü�� �����ѵ�
		 System.out.println(text3.reverse());       //StringBuffer.reverse()�� �ϸ� �������� ������
		 											//reverse();�� StringBuffer ��ü�� ���� ����
	}

}
