//program to check number is armstrong or not
package Javaprograms;
import java.util.*;
public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to check armstrong or not:");
int num=sc.nextInt();
Armstrongnum am=new Armstrongnum();
am.CheckArmstrong(num);
	}
public void CheckArmstrong(int n) {
	int rem;
	int temp;
	int digitcount=0;
	temp=n;
	
	while(n>0) {
		n=n/10;
		digitcount++;
		
	}
	n=temp;
	int sum=0;
	while(temp!=0) {
		rem=temp%10;
		sum= sum+((int)Math.pow(rem, digitcount));
		temp=temp/10;
	}
	if(sum==n) {
		System.out.println("armstrong");
	}
	else {
		System.out.println("Not armstrong");
	}
}
}
