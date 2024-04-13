
package Array_Of_Objects;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner Input = new Scanner (System.in);
        Scanner Input1 = new Scanner (System.in);
        
        for(int i=0;i<3;i++)
        {
            
            System.out.print("Enter the student name,id and cgpa : ");
            String name = Input.nextLine();
            int id = Input1.nextInt();
            //double cgpa = Input.nextDouble();
            
        }
    }
    
}
