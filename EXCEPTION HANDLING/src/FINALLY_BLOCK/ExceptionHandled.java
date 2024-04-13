
package FINALLY_BLOCK;



public class ExceptionHandled {
    
    public static void main(String[] args) {
        
        try
        {
            int x=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Java finally block is always executed whether exception is handled or not.");
            System.out.println("For each try block there can be zero or more catch block,but only one finally block.");
        }
    }
    
}
