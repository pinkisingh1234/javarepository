//program to reverse a number
package Javaprograms;
import java.util.*;
public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number to reverse:");
int number=sc.nextInt();
int result= Displayrevernum(number);
System.out.println("reverse of a number is: "+result);
	}
public static int Displayrevernum(int n) {
	int rev=0;
	int rem;
	while(n!=0) {
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	}
	
	
	
	return rev;
	
}
}
