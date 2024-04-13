
package CONVERSION_AND_CASTING;

import java.util.Scanner;

public class AddingLowerType {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int a,t;
        System.out.print("Enter iterations number : ");
        t= obj.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.print("\nEnter an integer number : ");
            a=obj.nextInt();
            byte b = (byte)a;
            System.out.println("Conversion of integer to byte : "+b);
            System.out.println();   
        }
        int x=10,y=10;
        byte sum;
        //sum = x;//Compile Time Error : because x is integer.
        //sum = (x+y)//Compile Time Error : because x+y=20 will be integer.
        sum = (byte)(x+y);
        System.out.println("Conversion the sum of two integers to byte : "+sum);
        
        byte mul,m=10;
        //mul=m*10// Error : Can not assign an integer to a byte.
        mul=(byte)(m*10);
        System.out.println("Conversion the multiplication of the byte variable m and 10 to byte : "+mul);
    }
    
}
