
package ARITHMETIC;


public class BitwiseUnaryOperators {
    
    void Negating(int a,int b)
    {
        // Negating an expression : 
        System.out.println("Minus of total positive value which stats from 0\t~a : "+~a);
        System.out.println("Positive of total minus, positive starts from 0 \t~b : "+~b);
    }
    void booleanInverting(boolean a,boolean b)
    {
        // Inverting the value of a boolean : 
        System.out.println(!a+"  "+!b);
    }
    
    public static void main(String[] args) {
        
        BitwiseUnaryOperators bup = new BitwiseUnaryOperators();
        
        bup.Negating(10, -10);
        bup.booleanInverting(true, false);
    }
    
}
