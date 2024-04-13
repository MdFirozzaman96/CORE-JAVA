
package MULTIPLE_CATCH_CLAUSES;



public class MultipleCatches {
    
    public static void main(String[] args) {
        
        try
        {
            int [] arr = new int [5];
            System.out.println("Before occuring the first exception.");
            int n=arr[5]/0;
            //System.out.println("after occuring the first exception.");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic Exception occures : "+ex);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurs : "+ex);
        }
        catch(Exception ex)
        {
            System.out.println("Parent Exception occurs : "+ex);
        }
        System.out.println("Out of try block.");
        try
        {
            String str=null;
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic Exception occurs1."+ex);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurs1 : "+ex);
        }
        catch(Exception ex)
        {
            System.out.println("Parent Exception occurs1 : "+ex);
        }
        
    }
    
}
