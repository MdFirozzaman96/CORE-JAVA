
package NESTED_TRY;



public class NestedTry {
    
    public static void main(String[] args) {
        
        try
        {
            int[] arr = new int [5];
            try
            {
                arr[0]=10/0;
            }
            catch(ArithmeticException ex)
            {
                System.out.println("Inside try 1 : "+ex);
            }
            try
            {
                arr[5]=130;
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Inside try 2 : "+ex);
            }
        }
        catch(Exception ex)
        {
            System.out.println("Outside try1 : "+ex);
        }
    }
    
}
