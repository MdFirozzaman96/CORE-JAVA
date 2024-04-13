
package Built_in_Packages;

import java.util.Scanner;

public class UtilInput {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Username : ");
        
        String userName;
        userName = obj.nextLine();
        
        System.out.print("Enter Id : ");
        int id = obj.nextInt();
        
        System.out.print("Enter CGPA : ");
        float cg = obj.nextFloat();
        
        System.out.print("Enter Phone No : ");
        long contactNumber = obj.nextLong();
        
        System.out.println("\nUsrname is : "+userName);
        System.out.println("Id : "+id);
        System.out.println("CGPA : "+cg);
        System.out.println("Phone No : "+contactNumber);
        
    }
    
}
