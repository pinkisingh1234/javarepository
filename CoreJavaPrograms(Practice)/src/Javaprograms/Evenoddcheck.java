//program to find even or odd number
package Javaprograms;
import java.util.*;
public class Evenoddcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check:");
		int num=sc.nextInt();
		Evenoddcheck even=new Evenoddcheck();
		even.CheckEvenOdd(num);
		

	}
	public void  CheckEvenOdd(int n) {
		if(n%2==0) {
			System.out.println("Number is Even");
			
		}
		else {
			System.out.println("Number is odd");
		}
		
	}

}
