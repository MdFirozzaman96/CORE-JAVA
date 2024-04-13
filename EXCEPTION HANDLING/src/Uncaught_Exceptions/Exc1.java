
package Uncaught_Exceptions;

//import java.util.Scanner;

public class Exc1 {
    
    static int Quotient(int n,int d)
    {
        return n/d;
    }
    
    public static void main(String[] args) {
        
        /*Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter two integer nubmer : ");
        int n,d;
        n=obj.nextInt();
        d=obj.nextInt();
        System.out.println("The Quotient of "+n+" and "+d+" is : "+Quotient(n,d));*/
        
        System.out.println("The Quotient of 25 by 0 is : "+Quotient(25,0));
        
        
    }
    
}
