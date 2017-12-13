package practice;

/**
 * 
c=30

ch=C

f=1.5

l = 27000000000

result = false



 */

public class Exercise3_8 {
public static void main(String[] args) {

byte a = 10;
byte b = 20;
int c = a + b; 
char ch = 'A'; 

//ch =ch + 2;
ch =(char)(ch + 2); //(ch + 2)한뒤 Casting 필요 

//float f = 3 / 2;
float f =(float) 3 / 2;

//long l = 3000*3000*3000;
long l = 3000*3000*3000l; //숫자중 하나만 l을 붙여서 long type으로 변환  
float f2 = 0.1f;
double d = 0.1;
boolean result = d==f2;
System.out.println("c="+c);
System.out.println("ch="+ch);
System.out.println("f="+f);
System.out.println("l="+l);
System.out.println("result="+result);
}

}