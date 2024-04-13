
package MODIFIERS;

public class StaticMethod {
    
    int a;
    static int x;
    void fun()
    {
        System.out.println("This is a Non-Static method.");
    }
    static void fun1()
    {
        System.out.println("Static method can only directly access other static method and data without creating any object.");
    }
    
    public static void main(String[] args) {
        
        StaticMethod obj = new StaticMethod();
        
        obj.a = 5;
        //obj.fun1();
        fun1();
        System.out.println(x);
        
    }
    
}
