
package EXCEPTION_PROPAGATION;



public class CheckedExceptionPropagation {
    
    void a()
    {
        // throw new ArithmeticException("Exception handled.");// Unchecked Exception.
        throw new java.io.IOException("Checked exceptions are not propagated.");// Checked Exception.
    }
    void b()
    {
        a();
    }
    void c()
    {
        try
        {
            a();
        }
        catch(Exception e)
        {
            System.out.println("Exception handled.");
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        
        CheckedExceptionPropagation obj = new CheckedExceptionPropagation();
        obj.c();
        System.out.println("Normal flow.");
    }
    
}
