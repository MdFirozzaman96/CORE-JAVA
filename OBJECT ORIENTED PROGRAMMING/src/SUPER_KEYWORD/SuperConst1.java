
package SUPER_KEYWORD;


public class SuperConst1 {
    
    SuperConst1()
    {
        System.out.println("This is a non parameterized constructor.");
    }
    SuperConst1(String msg)
    {
        System.out.println(msg);
    }
    
}

class SubClass1 extends SuperConst1{
    
    SubClass1()
    {
        //super();
        super("This is a parameterized constructor.");
        System.out.println("Call to super must be the first statement in constructor.");
    }
}

class TestSuperConst1{
    
    public static void main(String[] args) {
        
        SubClass1 obj = new SubClass1();
        SuperConst1 obj1 = new SuperConst1();
    }
}
