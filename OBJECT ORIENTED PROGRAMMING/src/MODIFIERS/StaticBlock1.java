
package MODIFIERS;


public class StaticBlock1 {
    
    static int x=2;
    static int y=2;
    int a=2;
    
    static void show(int z)
    {
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
    }
    static
    {
        System.out.println("Static block is executed before the main method.");
        x=x*10;
    }
    
    public static void main(String[] args) {
        
        show(1);
    }
    
}
