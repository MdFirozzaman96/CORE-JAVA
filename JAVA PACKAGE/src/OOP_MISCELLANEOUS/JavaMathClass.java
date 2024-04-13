
package OOP_MISCELLANEOUS;

import java.util.Scanner;


public class JavaMathClass {
    
    public static void main(String[] args) {
        
         double x = 7.5,y=-15.3;
        
        System.out.println("The maximum value of "+x+" and "+y+" is : "+Math.max(x, y));
        System.out.println("The minimum value of "+x+" and "+y+" is : "+Math.min(x, y));
        
        System.out.println("The absolute value of "+y+" is : "+Math.abs(y));
        
        System.out.println("The ceil value of "+y+" is : "+Math.ceil(y));
        System.out.println("The ceil value of "+x+" is : "+Math.ceil(x));
        
        System.out.println("The floor value of "+y+" is : "+Math.floor(y));
        System.out.println("The floor value of "+x+" is : "+Math.floor(x));
        
        System.out.println("The squre root of 25 is "+Math.sqrt(25));
        
        System.out.println("Random Number : "+Math.random()* 100);
        
        int n,p;
        
        System.out.print("Enter an integer number and a power of that number : ");
        
        Scanner obj = new Scanner(System.in);
        
        n=obj.nextInt();
        p=obj.nextInt();
        
        System.out.println("The power of "+n+" of "+p+" is : "+Math.pow(n,p));
        
        double d;
        for(int i=0;i<4;i++)
        {
            System.out.print("Enter a double number : ");
            d=obj.nextDouble();

            System.out.println("The round value of "+d+" is : "+Math.round(d));
        }

    }
    
}
