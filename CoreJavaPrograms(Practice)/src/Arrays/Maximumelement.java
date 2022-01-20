//program to find maximum element
package Arrays;
import java.util.*;
public class Maximumelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter elements in array:");
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();	
}
Maximumelement m=new Maximumelement();
m.findMaximumElement(a);
	}
	public void findMaximumElement(int ar[]) {
		int max;
		max=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("maximum element in array are:" +max );
	}

}
