package 연산자와클래스;
class PlusMinus {
	int i = 10;
	
	void Plus(){
		i = +i;
	}
	void Minus(){
		i = -i;
	}
	
	void print(){
		System.out.printf("i = %d \n",i);
	}
	
}


public class OperatorEx3 {

	public static void main(String[] args) {
			PlusMinus pm = new PlusMinus();
			pm.Plus();
			pm.print();
			
			pm.Minus();
			pm.print();

	}

}
