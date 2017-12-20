package 연산자와클래스;

public class Calculator {
	int plusfront(int i,int j) {
		j = i++;
		return j;
	}
	
	int plusback(int i,int j) {
		j = ++i;
		return j;
	}
}
