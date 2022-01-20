package Javaprograms;
import java.util.*;
public class PrimeNumberprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter limit to print prime nubers");
int num=sc.nextInt();
PrimeNumberprint prime=new PrimeNumberprint();
prime.printPrintNumber(num);

	}
public int printPrintNumber(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		for(int j=2;j<i/2;j++) {
			if(i%j==0) {
				count=count+1;
				break;
			}
		}
			if(count==0&&i!=1) {
				System.out.println(i+"");
			}
		}
	
	return 0;
	
	
}
}
