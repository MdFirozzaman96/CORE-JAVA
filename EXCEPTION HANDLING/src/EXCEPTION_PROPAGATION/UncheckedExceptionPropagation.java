
package EXCEPTION_PROPAGATION;


public class UncheckedExceptionPropagation {
    
    void a()
    {
        int x=10/0;
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
        
        UncheckedExceptionPropagation obj = new UncheckedExceptionPropagation();
        obj.c();
        
    }
    
}
