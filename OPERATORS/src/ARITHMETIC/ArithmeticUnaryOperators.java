
package ARITHMETIC;


public class ArithmeticUnaryOperators {
    
    void IncDec(int x,int a,int b)
    {
        
        // 1. Incrementing/decrementing a value by one : 
        
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        
        System.out.println();
        
        System.out.println(a+++b++);
        System.out.println(++a+b++);
        System.out.println(++a+ ++b);
    }
    
    public static void main(String[] args) {
        
        ArithmeticUnaryOperators aup = new ArithmeticUnaryOperators();
        aup.IncDec(10, 10, 10);   
    }
    
}
