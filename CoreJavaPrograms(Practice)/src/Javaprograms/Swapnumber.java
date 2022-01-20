//program to swap two number without using third variable
package Javaprograms;
import java.util.*;

public class Swapnumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a:");
int a=sc.nextInt();
System.out.println("Enter value of b:");
int b=sc.nextInt();
Swapnumber sp=new Swapnumber();
sp.swapTwoNumber(a, b);
	}

	public void swapTwoNumber(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}
