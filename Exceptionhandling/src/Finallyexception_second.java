
public class Finallyexception_second{    
    public static void main(String args[]){   

    try {    

      System.out.println("Inside the try block");  
        
      //exception occur 
     int data=20/0;    
     System.out.println(data);    
    }    
    //cannot handle Arithmetic type exception  
    //can only accept Null Pointer type exception  
    catch(NullPointerException e){  
      System.out.println(e);  
    }   

    finally {  
      System.out.println("finally block is always executed");  
    }    

    System.out.println("rest of the code...");    
    }    
  }    
