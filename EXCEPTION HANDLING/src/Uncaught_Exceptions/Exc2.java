
package Uncaught_Exceptions;


public class Exc2 {
    
    public static void main(String[] args) {
        
        int q,d=0;
        try
        {
            System.out.println("Before occured exception inside try block.");
            q=45/d;
            System.out.println("After occur exception inside try block.");
            
        }catch(ArithmeticException obj)
        {
            System.out.println("Inside catch block.");
        }
        System.out.println("Outside the try catch block.");
    }
    
}
