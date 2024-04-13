
package Final_Keyword;


final public class FinalClass {
    
    void show()
    {
        System.out.println("This is final class.");
    }
    
}
class SubClass extends FinalClass{
    
    void msg(String msg)
    {
        System.out.println(msg);
    }
}

class TestFinalClass{
    
    public static void main(String[] args) {
        
        SubClass obj = new SubClass();
        obj.show();
        obj.msg("Final Class can not be derived.");
    }
}
