/*
what if you want to assign an int value to a byte variable? This conversion will
not be performed automatically, because a byte is smaller than an int. This
kind of conversion is sometimes called a narrowing conversion, since you are
explicitly making the value narrower so that it will fit into the target type.

*/


package CONVERSION_AND_CASTING;



public class IncompatibleNarrowing {
    
    public static void main(String[] args) {
        
        float f = 100000.34f;
        System.out.println("Flaoting Types Variable f : "+f);
        //int a = f; // Narrowing
        
        int a = (int)f;
        System.out.println("Integer Types Variable a : "+a);// Casting
        
        //byte b = a; // Narrowing
        
        byte b =(byte)a;
        System.out.println("Byte Types Variable b : "+b);
        
        int n=10;
        b =(byte)n;
        System.out.println("Byte Types Variable b : "+b);
        byte bb = (byte)n;
        System.out.println("Byte Types Variable bb : "+bb);
        
        int c=234;
        byte cc=(byte)c;
        System.out.println("cc : "+cc);
        int aa=257;
        byte ccc=(byte)aa;
        System.out.println("ccc : "+ccc);
        
        System.out.println();
        //Conversion of double to byte : 
        double d = 323.142;
        System.out.println("Double Variable d : "+d);
        byte db=(byte)d;
        System.out.println("Conversion of double to byte : "+db);
        
        double dd=324.142;
        System.out.println("Double Variable dd : "+dd);
        byte ddb=(byte)dd;
        System.out.println("Conversion of double to byte : "+ddb);
        System.out.println();
        
        // Truncation ; 
        float ff = 5.63f;
        System.out.println("Float ff : "+ff);
        int x=(int)ff;
        System.out.println("The integer value of x after performing type casting of ff : "+x);
        
    }
    
}
