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
		
		v2.add(new Book("난장이가 쏘아올린공","조세희","삼익출판사",500));
		
//		for(int i=0;i<v2.size();i++) {
//			System.out.println("책이름:"+v2.get(i).name);
//			System.out.println("저자:"+v2.get(i).author);
//			System.out.println("출판사:"+v2.get(i).publisher);
//			System.out.println("가격:"+v2.get(i).price);
//		}
		
		//이터레이터 사용
		Iterator it = v2.iterator();
		Book b;
		while(it.hasNext()) {
			b = (Book)it.next();
			System.out.println("책이름:"+b.name);
			System.out.println("저자:"+b.author);
			System.out.println("출판사:"+b.publisher);
			System.out.println("가격:"+b.price);
			
		}
		
	}
	
	

}
