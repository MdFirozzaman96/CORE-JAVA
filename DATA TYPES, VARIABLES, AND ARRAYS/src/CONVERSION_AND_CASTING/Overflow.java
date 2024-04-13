
package CONVERSION_AND_CASTING;

import java.util.Scanner;

public class Overflow {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int a,t;
        System.out.print("Enter iterations number : ");
        t= obj.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.print("Enter an integer number : ");
            a=obj.nextInt();
            byte b = (byte)a;
            System.out.println("Conversion of integer to byte : "+b);
            System.out.println();   
        }
    }
    
}
