
package BITWISE;

import java.util.Scanner;

public class BitwiseOperators {
    
    
    int BitwiseOR(int a,int b)
    {
        return a|b;
    }
    int BitwiseAND(int a,int b)
    {
        return a&b;
    }
    int BitwiseNOT(int x)
    {
        return ~x;
    }
    int BitwiseXOR(int a,int b)
    {
        return a^b;
    }
    
    int ShiftLeft(int n)
    {
        return n>>4;
    }
    int ShiftRight(int n)
    {
        return n<<4;
    }
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two integer number to perform Bitwise Operations : ");
        int a,b;
        a=obj.nextInt();
        b=obj.nextInt();
        
        BitwiseOperators op=new BitwiseOperators();
        System.out.println("The result of Bitwise OR : "+op.BitwiseOR(a, b));
        System.out.println("The result of Bitwise AND : "+op.BitwiseAND(a, b));
        System.out.println("The result of Bitwise XOR : "+op.BitwiseXOR(a, b));
        
        System.out.print("Enter an integer number to perform NOT operation : ");
        int x;
        x=obj.nextInt();
        System.out.println("The result of Bitwise NOT : "+op.BitwiseNOT(x));
        
        System.out.println("\n\t\tBITWISE OPERATION");
        
        System.out.print("Enter an integer number to perform Left Shift operation : ");
        x=obj.nextInt();
        System.out.println("The result of Left Shift : "+op.ShiftLeft(x));
        
        System.out.print("Enter an integer number to perform Left Shift operation : ");
        x=obj.nextInt();
        System.out.println("The result of Right Shift : "+op.ShiftRight(x));
        
        
    }
    
}
