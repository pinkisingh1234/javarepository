//program to display another string methods
package String;
import java.util.*;
public class Stringmethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="MS.Pinki singh";
System.out.println(str1.startsWith("MS"));//it checks from starting index
	System.out.println(str1.startsWith("Pinki", 3));//it check from specified index
	System.out.println(str1.endsWith("singh")); //it check from last index
	System.out.println(str1.charAt(3));
	//print all characters
	System.out.println("Print every character of string");
	for(int i=0;i<str1.length();i++) {
		System.out.print(str1.charAt(i) +" ");
	}
	
	System.out.println();
	String str2 = "www.udemy.com.in";
	System.out.println(str2.indexOf('.'));// for character index
	System.out.println(str2.indexOf("com"));//for String index
	
	System.out.println(str2.indexOf('.', 4)); // used to check index of character from specified index
	System.out.println(str2.lastIndexOf('.'));
	System.out.println(str2.concat(str1));
	System.out.println(str2.equals(str1));
	System.out.println(str2.compareTo(str1));


	}

}
