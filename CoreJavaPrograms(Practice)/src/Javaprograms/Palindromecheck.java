//program to check number is palindrone or not
package Javaprograms;
import java.util.Scanner;
public class Palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in); 
	System.out.println("Enter number to check:");
	int num=sc.nextInt();
	Palindromecheck p=new Palindromecheck();
	p.Checkpalindrome(num);
}
	
	
	public void Checkpalindrome(int n) {
		int original,rem;
	int rev=0;
		original=n;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
	
		}
		if(rev==original) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("Given number is not palindrome");

			}
	}

}
