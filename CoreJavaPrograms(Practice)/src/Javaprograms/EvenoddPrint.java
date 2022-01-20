package Javaprograms;
import java.util.*;
public class EvenoddPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit to print even and odd number:");
int n=sc.nextInt();
printEvenOdd(n);
	}
public static void printEvenOdd(int num) {
	System.out.println("even number are:");

	for(int i=1;i<=num;i++) {
		if(i%2==0) {
			
			System.out.println(i);
		}
	}
	System.out.println("Odd n numbers are:");

		for(int i=0;i<num;i++)

		{
           if(i%2!=0)			
			System.out.println(i);
		}
	}

}