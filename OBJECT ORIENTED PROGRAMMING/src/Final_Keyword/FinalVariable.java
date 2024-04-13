
package Final_Keyword;


public class FinalVariable {
    
    final int speedlimit=60;//Final variable.
    
    void MaxLimit()
    {
        speedlimit=150;//If final variable once assigned a value can never be changed. Here compile time error occured.
    }
    public static void main(String[] args) {
        
        FinalVariable obj = new FinalVariable();
        obj.MaxLimit();
    }
    
}