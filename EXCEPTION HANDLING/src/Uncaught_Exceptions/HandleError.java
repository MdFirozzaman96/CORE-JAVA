
package Uncaught_Exceptions;

import java.util.Random;
import java.util.Scanner;

public class HandleError {
    
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        int n;
        System.out.print("Enter the iteration number : ");
        n=num.nextInt();
        
        Random obj = new Random();
        for(int i=0;i<n;i++)
        {
            int x,y,result;
            x=obj.nextInt();
            y=obj.nextInt();
            
            int div=(x/y);
            System.out.println("div : "+div);
            try
            {
                result=(12345/div);
            }catch(ArithmeticException ob)
            {
                System.out.println("Description of The Exception : "+ob);
                result=-130;
            }
            System.out.println("result : "+result);
            
        }
        
    }
    
}
