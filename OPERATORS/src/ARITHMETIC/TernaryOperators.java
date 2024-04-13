
package ARITHMETIC;

import java.util.Scanner;

public class TernaryOperators {
    
    int minValue(int a,int b)
    {
        int Min=(a<b)?a:b;
        return Min;
    }
    
    int maxValue(int a,int b)
    {
        int Max=(a>b)?a:b;
        return Max;
    }
    
    int getAbsolute(int x)
    {
        int ab;
        ab=(x<0)?-x:x;
        return ab;
    }
    
    public static void main(String[] args) {
        
        TernaryOperators obj = new TernaryOperators();
        Scanner element = new Scanner(System.in);
        
        System.out.print("Enter two integer value to perform Max operation : ");
        int a,b;
        a=element.nextInt();
        b=element.nextInt();
        System.out.println("The maximum value between "+a+" and "+b+" is : "+obj.maxValue(a, b));
        
        System.out.print("\nEnter two integer value to perform Min operation : ");
        int x,y;
        x=element.nextInt();
        y=element.nextInt();
        System.out.println("The minimum value between "+x+" and "+y+" is : "+obj.minValue(x, y));
        System.out.println();
        
        
        int ng=-10;
        System.out.print("\nng = -10, -ng : "+-ng);
        System.out.println();
        int n;
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter an integer number to convert it into absolute : ");
            n=element.nextInt();
            System.out.println("The abosoute value of "+n+" is "+obj.getAbsolute(n));
        }
    }
    
}
