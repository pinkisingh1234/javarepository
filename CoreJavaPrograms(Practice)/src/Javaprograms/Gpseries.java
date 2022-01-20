//program to display gp series
package Javaprograms;
import java.util.*;
public class Gpseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Program to display GP series....");
		System.out.println("Enter a,r.nthterm");
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		Gpseries gp=new Gpseries();
		gp.DisplayGpSeries(a, r, n);

	}
public void DisplayGpSeries(int a,int r,int nthterm)
{
int term=a;
for(int i=0;i<nthterm;i++) {
	System.out.print(term  +" ,");
	term=term*r;
}

}
}
