package instanceof_exam;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceofExample {

	public static void main(String[] args) {
		Person Jee = new Student();
		Person Kim = new Professor();
		Person Lee = new Researcher();
		
		if(Jee instanceof Student)
			System.out.println("Jee�� Student Ÿ��"); 
		if(Jee instanceof Researcher)
			System.out.println("Jee�� Researcher Ÿ��");
		if(Kim instanceof Student)
			System.out.println("Kim�� Student Ÿ��");
		if(Kim instanceof Professor)
			System.out.println("Kim�� Professor Ÿ��");
		if(Kim instanceof Researcher)
			System.out.println("Kim�� Researcher Ÿ��");
		if(Kim instanceof Person)
			System.out.println("Kim�� Person Ÿ��");
		if(Lee instanceof Professor)
			System.out.println("Lee�� Professor Ÿ��");
		if("Java" instanceof String)
			System.out.println("\"java\"�� String Ÿ��");
		
	}

}
