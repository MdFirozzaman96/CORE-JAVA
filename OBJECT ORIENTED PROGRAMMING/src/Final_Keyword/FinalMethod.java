
package Final_Keyword;



public class FinalMethod {
    
    final void MaxLimit()
    {
        System.out.println("Running safely with maximum 75 kmhr");
    }  
}
class Bike extends FinalMethod{
    
    void MaxLimit() // Final method can not be overriden.
    {
        System.out.println("Running safely with maximum 100 kmhr");
    }
}

class TestFinalMethod{
    
    public static void main(String[] args) {
        
        FinalMethod r;
        FinalMethod obj1 = new FinalMethod();
        r=obj1;
        r.MaxLimit();
        Bike obj2 = new Bike();
        r=obj2;
        r.MaxLimit();
        
        
    }
}
