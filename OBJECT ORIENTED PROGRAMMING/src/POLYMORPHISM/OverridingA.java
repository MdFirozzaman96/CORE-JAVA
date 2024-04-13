
package POLYMORPHISM;


public class OverridingA {
    
    OverridingA()
    {
        System.out.println("Default Constructor A");
    }
    OverridingA(String str)
    {
        System.out.println(str);
    }
    void Operation()
    {
        System.out.println("Empty Operation A");
    }
    int Operation(int a,int b)
    {
        return a+b;
    } 
}

class OverridingB extends OverridingA {
    
    OverridingB()
    {
        System.out.println("Default Constructor B");
    }
    OverridingB(String str)
    {
        System.out.println(str);
    }
    void Operation()
    {
        System.out.println("Empty Operation B");
    }
    int Operation(int a,int b)
    {
        return a*b;
    } 
}

class TestOverriding{
    
    public static void main(String[] args) {
        
        System.out.println("Class OverridingA : \n");
        
        OverridingA oba=new OverridingA();
        OverridingA oba1=new OverridingA("Parameterized Constructor A");
        oba.Operation();
        System.out.println("Operation : "+oba.Operation(7,7));
        
        System.out.println("\nClass OverridingB : \n");
        
        OverridingB obb=new OverridingB();
        OverridingB obb1=new OverridingB("Parameterized Constructor B");
        obb.Operation();
        System.out.println("Operation : "+obb.Operation(7,7));
    }
}
