/*
 If you are extending an abstract class that has an abstract method, you must either provide the
implementation of the method or make this class abstract.
 */
package ABSTRACTION;


/*public abstract class Rule2 {
    
    abstract void msg();   
}

class A extends Rule2{
    
    void msg()
    {
        System.out.println("This class derived from Rule2 class that has an abstract method.Therefore We must provide the implementation of the method");
    }
    public static void main(String[] args) {
        
        A obj = new A();
        obj.msg();
    }
}*/

public abstract class Rule2 {
    
    abstract void msg(); 
}

abstract class A extends Rule2{
    
    void concrete()
    {
        System.out.println("This a concrete method.");
    }
    
    public static void main(String[] args) {
        
        Rule2 obj = new Rule2();
        A obj1 = new A();
    }
}
