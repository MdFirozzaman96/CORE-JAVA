
package Array_Of_Objects;
import java.util.Scanner;

public class ArrayOfObjects_1_Test {
   
    public static void main(String[] args) {
        ArrayOfObjects_1_Test A = new ArrayOfObjects_1_Test();
        System.out.println("~~~~~~~~~********WELCOME TO THE STUDENT MANAGEMENT SYSTEM********~~~~~~~~~\n\n");
        //System.out.println("Enter the Array Size : ");
        //Scanner arr = new Scanner (System.in);
        Scanner student = new Scanner(System.in);
        //int size = arr.nextInt();
        Scanner name = new Scanner (System.in);
        Scanner id = new Scanner (System.in);
        Scanner gpa = new Scanner (System.in);
        Creating_A_ArrayOfObjects_1 [] obj = new Creating_A_ArrayOfObjects_1 [200];
        
        
        System.out.print("Enter the total number of students : ");
        int total = student.nextInt();
        System.out.println("\nEnter the Name,ID and GPA of the student : \n");
        
        for(int i=0;i<total;i++)
                    {

                        System.out.println(""+(i+1)+".");
                        System.out.print("Name : ");
                        String NAME = name.nextLine();
                        //(obj[i].Name).set(NAME);
                        System.out.print("ID : ");
                        int ID = id.nextInt();
                        System.out.print("GPA : ");
                        double GPA = gpa.nextDouble();
                        obj[i] = new Creating_A_ArrayOfObjects_1();
                        obj[i].set(NAME,ID,GPA);
                        System.out.println("");

                    }
        System.out.println("\nChoose your option :\n");
        int option;
        do
        {
            
            System.out.println("1 for shwing information");
            System.out.println("2 for insert a student");
            System.out.println("3 for Update student");
            System.out.println("4 for delete a student");
            System.out.println("5 for return");
            System.out.println("");
            System.out.print("Enter the option : ");
            option = id.nextInt();
            System.out.println("");
            switch(option)
            {
                
                case 1:
                    
                    System.out.println("~~~~~STUDENT INFORMATION~~~~~\n");
                    for(int i=0;i<total;i++)
                    {
                        System.out.println(""+(i+1)+".");
                        obj[i].show();
                        //obj[i].NAME.show();
                    }
                    break;
                case 2:
                    System.out.println("~~~~INSERT A STUDENT~~~~\n");
                    System.out.println("\nEnter the information of the student :");
                    System.out.print("Name : ");
                    String NAME = name.nextLine();
                    System.out.print("ID : ");
                    int ID = id.nextInt();
                    System.out.print("GPA : ");
                    double GPA = gpa.nextDouble();
                    //total =total+1;
                    obj[total] = new Creating_A_ArrayOfObjects_1();
                    obj[total].set(NAME,ID,GPA);

                    for(int i=0;i<total+1;i++)
                    {
                        System.out.println(""+(i+1)+".");
                        obj[i].show();
                    }
                    break;
                case 3:
                    System.out.println("~~~~UPDATE INFORMATION~~~~\n");
                    System.out.println("Enter the serial number of the student : ");
                    Scanner location = new Scanner(System.in);
                    int serial = location.nextInt();
                    serial = serial-1;
                    System.out.println("Enter the student information whose are inserted : ");
                    System.out.print("Name :");
                    String Name = name.nextLine();
                    System.out.print("ID : ");
                    int Id = id.nextInt();
                    System.out.print("GPA : ");
                    double Gpa = gpa.nextDouble();
                    obj[serial].set(Name, Id, Gpa);
                    System.out.println("\nAfter Updatting Student : \n");
                    for(int i = 0;i<total+1;i++)
                    {
                        System.out.println(""+(i+1)+".");
                        obj[i].show();
                    }
                    break;
                case 4:
                    System.out.println("~~~~ DELETE A STUDENT~~~~\n");
                    System.out.println("Enter the serial numner whose are deleted : ");
                    Scanner del = new Scanner(System.in);
                    int delete = del.nextInt();
                    delete = delete-1;
                    if(obj[delete]==null)
                    {
                        System.out.println("Null ! Nothing Else.");
                    }
                    else
                    {
                        for(int i=delete;i<total;i++)
                        {
                            obj[delete]=obj[delete+1];
                        }
                        for(int i=0;i<total;i++)
                        {
                            System.out.println(""+(i+1)+".");
                            obj[i].show();
                        }
                    }
                   
                    break;              
                    
            }
            
            
            
        }while(option!=5);
  
    }
    
}
