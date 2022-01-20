//program to find gcd/hcf of two numbers
package Javaprograms;
import java.util.*;
public class Gcdfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
Gcdfind gcd=new Gcdfind();
gcd.DisplayGcd(a, b);
	}
void DisplayGcd(int m,int n) {
	while(m!=n) {
		if(m>n) {
			m=m-n;
		}
		else {
			n=n-m;
		}
	}
	System.out.println("GCD of two numbers are: "+m);
}
}
