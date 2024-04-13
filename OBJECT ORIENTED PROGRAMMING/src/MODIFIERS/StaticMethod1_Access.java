
package MODIFIERS;


public class StaticMethod1_Access {
    
    public static void main(String[] args) {
        
        //System.out.println(x);
        System.out.println(StaticMethod1.x);
        StaticMethod1.display();
        
        StaticMethod1 obj = new StaticMethod1();
        System.out.println(obj.y);
        obj.show();
    }
    
}
