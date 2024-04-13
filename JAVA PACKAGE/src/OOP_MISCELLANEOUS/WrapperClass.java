
package OOP_MISCELLANEOUS;

import java.util.Scanner;

public class WrapperClass {
    
    String IntToString(int n)
    {
        Integer obj = n;
        String str = obj.toString();
        return str;
    }
    
    public static void main(String[] args) {
        
        Integer MyInt = 130;
        Double MyDouble = 2.70;
        Character MyChar = 'F';
        String MyStr = "Md. Firozzaman";
        
        System.out.println(MyInt+" "+MyInt.intValue());
        System.out.println(MyInt.intValue());
        
        System.out.println(MyDouble+" "+MyDouble.doubleValue());
        System.out.println(MyDouble.doubleValue());
        
        System.out.println(MyChar+" "+MyChar.charValue());
        System.out.println(MyChar.charValue());
        
        System.out.println(MyStr);
        
        /*System.out.println(MyStr+" "+MyStr.StringValue());
        System.out.println(MyStr.stringValue());*/
        
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter an integer number to convert string : ");
            int x = obj.nextInt();
            
            WrapperClass wp = new WrapperClass();
            System.out.println("The length of string is : "+wp.IntToString(x).length());
        }
    }
    
}
