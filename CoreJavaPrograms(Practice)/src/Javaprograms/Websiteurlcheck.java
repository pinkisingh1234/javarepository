
//program to find websites and protocols used
package Javaprograms;
import java.util.*;
public class Websiteurlcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter url :");
String url=sc.nextLine();
Websiteurlcheck w=new Websiteurlcheck();
w.checkWebsiteProtocol(url);
	}

	public void checkWebsiteProtocol(String url) {
		String protocol= url.substring(0, url.indexOf(":"));
		if(protocol.equals("http")) {
			System.out.println("Hypertext Transfer Protocol");
			
		}
		else if(protocol.equals("ftp")){
			System.out.println("File transfer protocol");
			
		}
		String ext=url.substring(url.lastIndexOf(".")+1);
		if(ext.equals("com")) {
			System.out.println("Commercial site");
		}
		else if(ext.equals("org")) {
			System.out.println("Organisation");
		}
		else if(ext.equals("net")) {
			System.out.println("Network");
		}
	}
}
