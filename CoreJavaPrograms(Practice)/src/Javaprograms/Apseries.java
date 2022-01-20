//program to display ap series
package Javaprograms;
import java.util.*;
public class Apseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Program to print AP series....");

System.out.println("Enter first term a,difference d,last term n: ");
int a=sc.nextInt();
int d=sc.nextInt();
int n=sc.nextInt();
Apseries ap=new Apseries();
ap.DisplayApSeries(a, d, n);
	}
public void DisplayApSeries(int a,int d,int nth) {
	 int term=a;
	 for(int i=0;i<nth;i++) {
		 System.out.print(term + ",");
		 term=term+d;
	 }
}
}
