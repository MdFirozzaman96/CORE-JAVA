
package Student_File;
import java.util.Scanner;
public class Operations {
    Student obj = new Student();
       
            //System.out.println("Enter the student Name,ID and CGPA :");
            Scanner input = new Scanner (System.in);
            String Name = input.nextLine();
            int ID = input.nextInt();
            double CGPA = input.nextDouble();
            Student ob = new Student();
            obj.set(Name,ID,CGPA);
            obj.show();
    
}
