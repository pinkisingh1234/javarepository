
public class Trycatchblockex2 {  
	  
    public static void main(String[] args) {  
    	int i=55;  
        int j=0;  
        int data;  
        
        try  
        {  
        data=i/j; //may throw exception   
       // if exception occurs, the remaining statement will not exceute  
        System.out.println("rest of the code");  
        }  
             // handling the exception   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);
            
            // resolving the exception in catch block  
            System.out.println("Afer resolving the exception:");     
            System.out.println(i/(j+2));  

        }  
          
    }  
      
}  