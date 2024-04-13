
package THROW_KEYWORD;

import java.util.Scanner;

public class Throw {
    
    static void validate(int x)
    {
        if(x>=18)
        {
            System.out.println("Welcome to Vote.");
        }
        else
        {
            throw new ArithmeticException("Not Valid.");
        }
    }
    
    public static void main(String[] args) {
        
        /* 
           The Java throw keyword is used to explicitly throw an exception. We can throw either checked or uncheked exception in java by throw
           keyword. The throw keyword is mainly used to throw custom exception
        */
        int age;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        age=obj.nextInt();
        
        Throw.validate(age);
    }
    
}
