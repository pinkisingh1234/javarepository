//display factorial of a number
package Javaprograms;
import java.util.*;
public class Factorialdisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number to display factoral:");
int num=sc.nextInt();
displayFactorial(num);
	}
public static void displayFactorial(int n) {
	int fact=1;
	for(int i=1;i<=n;i++){
	fact=fact*i;	
	}
	System.out.println("Factorial of  number="+fact);
}
}
