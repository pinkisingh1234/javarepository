package Javaprograms;
import java.util.*;
public class Cuboidarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//voulme of cuboid
		System.out.println("Enter length,breadth and heigth:");
		int len=sc.nextInt();
		int be=sc.nextInt();
		int he=sc.nextInt();
		int volume= volumeofcuboid(len,be,he);
		System.out.println("Volume="+volume);
		System.out.println("Enter sides of cuboid:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		int area= areaofcuboid(l,b,h);
		System.out.println("Area="+area);
			

	}
public static int volumeofcuboid(int l,int b,int h) {
	int vl;
	vl=l*b*h;
	return vl;
	
}
//area of cuboid
public static  int areaofcuboid(int l,int b,int h) {
	int area;
	area= 2*(l*b+b*h+l*h);
	return area;
	
}

}
