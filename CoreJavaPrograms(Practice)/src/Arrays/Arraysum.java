//program to display sum of all elements
package Arrays;
import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
System.out.println("Enter elements in array...");
for(int i=0;i<arr.length;i++) {
arr[i]=sc.nextInt();
}
Arraysum sm=new Arraysum();
 int result=sm.DisplayArraySum(arr);
 System.out.println("sum of elements: "+result);
	}
	
	
public int DisplayArraySum(int ar[])
{
int sum=0;
//for(int i=0;i<ar.length;i++) {
//sum=sum+ar[i];
for(int x:ar) {
	
	sum=sum+x;
}
//System.out.print("sum of elements in array = "+sum);
return sum;

}
}
