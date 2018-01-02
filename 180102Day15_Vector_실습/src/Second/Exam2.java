package Second;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Exam2 {
	Vector<Student> a = new Vector<Student>();
	
	class Student{
		Student(String name,int StudentNum){
			this.name = name;
			this.StudentNum = StudentNum;
		}
		
		private String name;
		private int StudentNum;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getStudentNum() {
			return StudentNum;
		}
		public void setStudentNum(int studentNum) {
			StudentNum = studentNum;
		}
		
	}
	
	public static void main(String[] args) {
			Exam2 main = new Exam2(); 
			main.inputMain();
	}
	void inputMain() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("학생관리 프로그램 1.0 made by 최성찬");
			System.out.println("1.추가");
			System.out.println("2.삭제");
			System.out.println("3.출력");
			System.out.println("4.검색");
			System.out.println("5.정렬");
			System.out.println("6.수정");
			System.out.println("7.종료");
			System.out.print("원하는 작업의 번호를 입력하세요");
			switch(sc.nextInt()) {
				case 1:
					addStudent();
					break;
				case 2:
					
				case 3:
					printStudent();
					break;
				case 4:
					searchStudent();
					break;
				case 5:
				case 6:
					editStudent();
					break;
				case 7:
					break;
				default:
					inputMain();
			}
		}catch(Exception e){
			System.out.println("오류 다시 입력하세요");
			inputMain();
		}finally {
			sc.close();
		}
		
	}
	
	void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름을 입력하세요: ");
		String j = sc.next();
		System.out.print("학번을 입력하세요: ");
		int k = sc.nextInt();
		a.add(new Student(j,k));
		System.out.println("추가되었습니다");
		inputMain();
		sc.close();
	}
	
	void deleteStudent() {
		System.out.println("삭제할 학생의 번호를 입력하세요");
	}
	
	void printStudent() {
		Iterator it = a.iterator();
		Student s;
		while(it.hasNext()) {
			s = (Student)it.next();
			System.out.printf("학생이름: %s \n",s.getName());
			System.out.printf("학번: %d \n",s.getStudentNum());
			System.out.println();
		}
		inputMain();
	}
	
	void searchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생의 이름을 입력하세요: ");
		String searchName = sc.next();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getName().equals(searchName)) {
				System.out.printf("학번 : %d",(int)a.get(i).getStudentNum());
				System.out.println();
				break;
			}
		}
		inputMain();
	}
	
	void editStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 학생의 이름을 입력하세요: ");
		String searchName = sc.next();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getName().equals(searchName)) {
				Iterator it = a.iterator();
				Student s;
				while(it.hasNext()) {
					s = (Student)it.next();
					System.out.printf("학생이름: %s \n",s.getName());
					System.out.printf("학번: %d \n",s.getStudentNum());
					System.out.println();
				}
				System.out.print("수정할 학번을 입력하세요 :");
				int editNumb = sc.nextInt();
				a.get(i).setStudentNum(editNumb);
				System.out.println("수정완료 되었습니다");
				break;
			}
		}
		inputMain();
	}

}
