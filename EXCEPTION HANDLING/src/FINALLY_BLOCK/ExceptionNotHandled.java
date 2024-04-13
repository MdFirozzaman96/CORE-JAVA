
package FINALLY_BLOCK;



public class ExceptionNotHandled {
    
    public static void main(String[] args) {
        
        try
        {
            int x=10/0;
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Java finally block is always executed whether exception is handled or not.");
        }
    }
    
}
