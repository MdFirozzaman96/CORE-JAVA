
package Dynamic_Method_Dispatch;



public class DMD {
    
    void show()
    {
        System.out.println("DMD is the mechanism by which a call to an overridden method is resolved at run time,rather than compile time.");
    }  
}
class Upcasting extends DMD{
    
    void show()
    {
        System.out.println("If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.");
    }
}

class DMDTest{
    
    public static void main(String[] args) {
        
        DMD obj = new Upcasting();
        obj.show();
    }
}
