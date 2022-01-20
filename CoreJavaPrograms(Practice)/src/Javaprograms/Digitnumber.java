//program to display digit of number
package Javaprograms;
import java.util.*;
public class Digitnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to display digits ");
int num=sc.nextInt();
displayDigitNumber(num);
	}
public  static void displayDigitNumber(int n) {
	int rem;
	while(n>0) {
		rem=n%10;
		n=n/10;
		System.out.println(rem);
	}
	
}
}
