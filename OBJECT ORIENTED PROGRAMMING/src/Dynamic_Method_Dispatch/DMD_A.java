
package Dynamic_Method_Dispatch;



public class DMD_A {
    
    void show()
    {
        System.out.println("Hello A");
    }
    
}
class DMD_B extends DMD_A{
    
    void show()
    {
        System.out.println("Hello B");
    }
    
}
class DMD_C extends DMD_B{
    
    void show()
    {
        System.out.println("Hello C");
    }
    
}

class TestDMD{
    
    public static void main(String[] args) {
        
        DMD_A a = new DMD_A();
        DMD_B b = new DMD_B();
        DMD_C c = new DMD_C();
        DMD_A r;// Obtain a reference of type DMD_A
        r=a;// r refers to a DMD_A object.
        r.show();// calls DMD_A's version of msg.
        r=b;// r refers to a DMD_B object.
        r.show();// calls DMD_B's version of msg.
        r=c;// r refers to a DMD_C version of msg.
        r.show();// calls DMD_C's version of msg.
    }
}
