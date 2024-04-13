
package MULTIPLE_CATCH_CLAUSES;


public class MultipleCatches1 {
    
    public static void main(String[] args) {
        
        // Without most specific to most general !
        try
        {
            int [] arr = new int [5];
            arr[5]=30/0;
        }
        catch(Exception ex)
        {
            System.out.println("Common task completed.");
        }
        catch(ArithmeticException ex)// Exception ArithmeticException has already been caught.
        {
            System.out.println("Task1 is completed.");
        }
        catch(ArrayIndexOutOfBoundsException ex)// Exception ArrayIndexOutOfBoundsException has already been caught.
        {
            System.out.println("Task2 is completed.");
        }
    }
    
}
