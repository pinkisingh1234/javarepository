//program to display fibonacci series
package Javaprograms;
import java.util.*;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter number limit");
int limit=sc.nextInt();
Fibonacciseries f=new Fibonacciseries();
f.displayFibonacci(limit);
	}
public void displayFibonacci(int n) {
	int n1,n2,n3;
	n1=0;
	n2=1;
	System.out.print(n1+" "+n2+" ");
	for(int i=0;i<n;i++) {
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;

		}
}
}
