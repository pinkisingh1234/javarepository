//pprogram to display multiple of number
package Javaprograms;
import java.util.*;
public class Multiplynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to display table:");
		int n=sc.nextInt();
		displayMultiplication(n);
	}
	
public static  void displayMultiplication(int num) {
/*	for(int i=1;i<=10;i++) {
		System.out.println(num +"*" + i+ "="+(num*i));
	}*/
	int i=1;
	while(i<=10) {
		System.out.println(num +"*" + i+ "="+(num*i));
i=i+1;
	}
}
}
