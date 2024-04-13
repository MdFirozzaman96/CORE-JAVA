
package MODIFIERS;

public class StaticMethod1 {
    
    int y=10;
    public static int x=20;
    
    void show()
    {
        System.out.println("This is a non static method.");
    }
    static void display()
    {
        System.out.println("Static method can only access another static method or data without creating any object.");
    }
    
}
