//program to count number of digits 
package Javaprograms;
import java.util.*;
public class Countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter digits to count:");
int num=sc.nextInt();
Countdigit c=new Countdigit();
int result=c.displayCountdigit(num);
System.out.println("Count number of digits="+result);
	}
public int displayCountdigit(int n) {
	int count=0;
	while(n>0) {
		n=n/10;
		count=count+1;
	}
	
	
	
	return count;
}
}
