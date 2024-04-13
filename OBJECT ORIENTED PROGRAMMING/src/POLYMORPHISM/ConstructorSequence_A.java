
package POLYMORPHISM;



public class ConstructorSequence_A {
    
    ConstructorSequence_A()
    {
        System.out.println("This is constructor of class A");
    }
    ConstructorSequence_A(String msg)
    {
        System.out.println(msg);
    }
    
}

class ConstructorSequence_B extends ConstructorSequence_A{
    
    ConstructorSequence_B()
    {
        System.out.println("This is constructor of class B");
    }
    ConstructorSequence_B(String msg)
    {
        System.out.println(msg);
    }
    
}

class ConstructorSequence_C extends ConstructorSequence_B{
    
    ConstructorSequence_C()
    {
        System.out.println("This is constructor of class C");
    }
    ConstructorSequence_C(String msg)
    {
        System.out.println(msg);
    }
    
}

class TestConstructorSequence{
    
    public static void main(String[] args) {
        
         ConstructorSequence_C obc = new ConstructorSequence_C();
         System.out.println();
         ConstructorSequence_C obc1 = new ConstructorSequence_C("This is a parameterized constructor of class C");
         System.out.println();
         ConstructorSequence_B obb = new ConstructorSequence_B();
         System.out.println();
         ConstructorSequence_B obb1 = new ConstructorSequence_B("This is a parameterized constructor of class B");
         System.out.println();
         ConstructorSequence_A oba = new ConstructorSequence_A();
         System.out.println();
         ConstructorSequence_A oba1 = new ConstructorSequence_A("This is a parameterized constructor of class A");
         
    }
}


