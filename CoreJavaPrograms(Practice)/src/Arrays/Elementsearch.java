//program to search element in array
package Arrays;
import java.util.Scanner;
public class Elementsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int ar[]=new int[6];
System.out.println("Enter elements in array:..");
for(int i=0;i<ar.length;i++) {
	ar[i]=sc.nextInt();
	
}
System.out.println();
System.out.println("Enter key to search:");
int keyvalue=sc.nextInt();
SearchElement(ar,keyvalue);
	}
	
public static void SearchElement(int arr[],int key) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
		System.out.println("Element found at index="+i);
		System.exit(0);
		}
	

	}
	System.out.println("Element not found...");

}
}
