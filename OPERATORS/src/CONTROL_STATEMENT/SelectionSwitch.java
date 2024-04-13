
package CONTROL_STATEMENT;

import java.util.Scanner;

public class SelectionSwitch {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.print("What you want to know about my info(name,id,department,university name) ? : ");
        String str;
        str=obj.nextLine();
        switch(str)
        {
            case "name":
                System.out.println("Md. Firozzaman");
                break;
            case "id":
                System.out.println("180201130");
                break;
            case "department":
                System.out.println("CSE");
                break;
            case "university name":
                System.out.println("BAUST");
                break;
        }
        
    }
    
}
