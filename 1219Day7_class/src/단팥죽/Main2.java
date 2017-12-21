package ╢эфоав;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Main2 m = new Main2();
	    ╢эфоав фоав╣И[];
		фоав╣И = m.inputData();
		
	}
	
	╢эфоав inputData() {
		Scanner sc = new Scanner(System.in);
		int фоав╟╧╪Ж;
		System.out.print("ют╥бгр фоав а╬╥Ы ╟╧╪Ж╦╕ ют╥бго╪╪©Д :");
		фоав╟╧╪Ж = sc.nextInt();
		╢эфоав фоав╣И[] = new ╢эфоав[фоав╟╧╪Ж];
		
		for(int i=0;i<фоав╣И.length;i++) {
			System.out.printf("%d ╧Ьб╟ фоавюл╦╖ю╩ ют╥бго╪╪©Д: \n",i+1);
			фоав╣И[i].name = sc.next();
			System.out.println("╟║╟щю╩ ют╥бго╪╪©Д: ");
			фоав╣И[i].price = sc.nextInt();
			System.out.println("©К╥╝ю╩ ют╥бго╪╪©Д: ");
			фоав╣И[i].weight = sc.nextInt();
			System.out.println("фо╩ЙаЖ 1.гя╠╧ 2.аъ╠╧: ");
			фоав╣И[i].madein = sc.nextByte();
			System.out.println();
		}
		return фоав╣И[фоав╟╧╪Ж];
	}
	
	void printData(╢эфоав  фоав╣И[]) {
		for(int i=0;i<фоав╣И.length;i++) {
			String name = фоав╣И[i].getName();
			int price = фоав╣И[i].getPrice(); //4000
			int weight = фоав╣И[i].getWeight();
			System.out.println(i+"╧Ьб╟ фоав:"+name);
			System.out.println("╟║╟щ:"+price);
			System.out.println("©К╥╝:"+weight);
			if(фоав╣И[i].getMadein()==1) {
				System.out.println("гя╠╧╩Й");
			}else {
				System.out.println("аъ╠╧╩Й");
			}
			System.out.println();
			
		}
	}

}
