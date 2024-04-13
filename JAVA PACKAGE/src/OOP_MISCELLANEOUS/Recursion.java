
package OOP_MISCELLANEOUS;

import java.util.Scanner;

public class Recursion {
    
    int sum(int n)
    {
        if(n>0)
        {
            return n+sum(n-1);
        }
        else
        {
            return n;
        }
    }
    
    public static void main(String[] args) {
        
        int x;
        System.out.print("Enter an integer number : ");
        
        Scanner element = new Scanner(System.in);
        x=element.nextInt();
        
        Recursion obj = new Recursion();
        System.out.println("The sum of all elements from 0 to "+x+" is : "+obj.sum(x));
    }
    
}
