package Prac;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


class Book {

	public String name; 
	public String author; 
	public String publisher; 
	public int price;
	
	public Book(String name,String author,String publisher,int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
}


public class VectorPrac {

	
	public static void main(String[] args) {
		Vector<Book> v2 = new Vector<Book>();
		
		v2.add(new Book("�����̰� ��ƿø���","������","�������ǻ�",500));
		
//		for(int i=0;i<v2.size();i++) {
//			System.out.println("å�̸�:"+v2.get(i).name);
//			System.out.println("����:"+v2.get(i).author);
//			System.out.println("���ǻ�:"+v2.get(i).publisher);
//			System.out.println("����:"+v2.get(i).price);
//		}
		
		//���ͷ����� ���
		Iterator it = v2.iterator();
		Book b;
		while(it.hasNext()) {
			b = (Book)it.next();
			System.out.println("å�̸�:"+b.name);
			System.out.println("����:"+b.author);
			System.out.println("���ǻ�:"+b.publisher);
			System.out.println("����:"+b.price);
			
		}
		
	}
	
	

}
