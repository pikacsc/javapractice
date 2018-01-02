package first;
//1.책제목, 저자, 출판사, 가격을 ArrayList에 저장하고 출력하시오.
//
//
//
//2.책제목, 저자, 출판사, 가격을 ArrayList에 키보드로 입력을 해서
//데이터를 입력하고  출력하시오. 
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
		
		System.out.print("책이름을 입력하세요 :");
		String i = sc.next();
		
		System.out.print("저자를 입력하세요 :");
		String j = sc.next();
		
		System.out.print("출판사를 입력하세요 :");
		String k = sc.next();
		
		System.out.print("가격을 입력하세요 :");
		int l = sc.nextInt();
		
		a.add(new Book(i, j, k, l));
		
		Iterator it = a.iterator();
		Book b;
		while(it.hasNext()) {
			b = (Book)it.next();
			System.out.printf("책이름: %s \n",b.name);
			System.out.printf("저자: %s \n",b.author);
			System.out.printf("출판사: %s \n",b.publisher);
			System.out.printf("가격: %d \n",b.price);	
		}
	}
}
