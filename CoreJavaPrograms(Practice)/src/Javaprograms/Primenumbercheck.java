package Javaprograms;
import java.util.*;
public class Primenumbercheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
checkPrimeNumber(n);
	}
public static int checkPrimeNumber(int num) {
	int count=0;
	for(int i=2;i<num/2;i++) {
		if(num%i==0) {
			count=count+1;
			break;
		}
	}
	if(count==0) {
		System.out.println("number is prime");
	}
	else {
		System.out.println("Number is not prime");
	}
	
	return num;
}
}
