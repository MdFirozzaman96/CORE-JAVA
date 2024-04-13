
package SUPER_KEYWORD;


public class SuperConst {
    
    SuperConst()
    {
        System.out.println("This is a non parameterized constructor of parent class.");
    }
    
}
class SubClass extends SuperConst{
    
    //super();// 
    SubClass()
    {
        super();
        System.out.println("This is a derived class from SuperConst class.");
        // super(); Call to super must be the first statement in constructor.
    }
}

class TestSuperConst{
    
    public static void main(String[] args) {
        
        SubClass obj = new SubClass();
    }
}
