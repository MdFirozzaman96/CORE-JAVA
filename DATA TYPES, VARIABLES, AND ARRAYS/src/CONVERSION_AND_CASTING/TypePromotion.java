/*
 
 */
package CONVERSION_AND_CASTING;


public class TypePromotion {
    
    public static void main(String[] args) {
        
        int i = 20;
        short s = 1000;
        byte b = 127;
        char c = 'a';
        float f = 2.0f;
        double d = 10.99;
        
        double result = (f*b)+(i/c)-(d*s);
        System.out.println("Result : "+result);
        System.out.println();
        
        /*
        
        (f*b) : Byte is promoted to Float.
        (i/c) : Character is promoted to Integer.
        (d*s) : Short is promoted to Double.
        
        (f*b)+(i/c)-(d*s) == (float*byte)+(integer/character)-(double*short) == (float)+(integer)-(double) == (float)-(double) == (double)
        
        */
        System.out.println("(f*b)+(i/c)-(d*s) : ");
        System.out.println("(float*byte)+(integer/character)-(double*short)==(float)+(integer)-(double)==(float)-(double)==(double)\n");
        System.out.println();
    }
    
}
