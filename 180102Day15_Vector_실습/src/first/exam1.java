package first;
//1.å����, ����, ���ǻ�, ������ ArrayList�� �����ϰ� ����Ͻÿ�.
//
//
//
//2.å����, ����, ���ǻ�, ������ ArrayList�� Ű����� �Է��� �ؼ�
//�����͸� �Է��ϰ�  ����Ͻÿ�. 
//
//
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Book{
	String name;
	String author;
	String publisher;
	int price;
	
	public Book(String name,String author,String publisher,int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
}

public class exam1 {
	public static void main(String[] args) {
		ArrayList<Book> a = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("å�̸��� �Է��ϼ��� :");
		String i = sc.next();
		
		System.out.print("���ڸ� �Է��ϼ��� :");
		String j = sc.next();
		
		System.out.print("���ǻ縦 �Է��ϼ��� :");
		String k = sc.next();
		
		System.out.print("������ �Է��ϼ��� :");
		int l = sc.nextInt();
		
		a.add(new Book(i, j, k, l));
		
		Iterator it = a.iterator();
		Book b;
		while(it.hasNext()) {
			b = (Book)it.next();
			System.out.printf("å�̸�: %s \n",b.name);
			System.out.printf("����: %s \n",b.author);
			System.out.printf("���ǻ�: %s \n",b.publisher);
			System.out.printf("����: %d \n",b.price);	
		}
	}
}
