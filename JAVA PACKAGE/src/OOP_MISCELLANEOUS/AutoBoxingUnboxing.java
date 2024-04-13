
package OOP_MISCELLANEOUS;

import java.util.Scanner;

public class AutoBoxingUnboxing {
    
    public static void main(String[] args) {
        
         System.out.print("Enter an integer number : ");
         
         Scanner obj = new Scanner(System.in);
         
         int x = obj.nextInt();
         
         System.out.println("Auto-Boxing (Primitive to Wrapper) : ");
         Integer obx =x;
         System.out.println(obx);
         
         // Auto-Boxing Explicitly : 
         Integer obi = Integer.valueOf(x);
         System.out.println(obi);
         
         System.out.println("Unboxing (Wrapper to Primitive) : ");
         
         Integer a = new Integer(x);
         System.out.println("Object a : "+a);
         
         // Unboxing explicitly : 
         
         int i = a.intValue();
         System.out.println("i : "+i);
         
         int n=a;
         System.out.println("n : "+n);
    }
    
}
