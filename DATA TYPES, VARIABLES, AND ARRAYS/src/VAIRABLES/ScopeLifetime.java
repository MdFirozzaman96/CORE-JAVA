
package VAIRABLES;


public class ScopeLifetime {
    
    public static void main(String[] args) {
        
        int x=10;
        if(x==10)
        {
            int y=20;
            x*=y;
        }
        System.out.println("x : "+x);
        System.out.println("y : "+y);
        System.out.println("x : "+x);
    }
    
}
