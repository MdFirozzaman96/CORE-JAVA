
package ARRAYS;


public class OneDimArray {
    
    public static void main(String[] args) {
        
         
        // Two steps declaration : 
        int monthDays[];
         monthDays = new int[5];
         
         monthDays[0]=31;
         monthDays[1]=28;
         monthDays[2]=31;
         monthDays[3]=30;
         monthDays[4]=31;
         
         System.out.println("monthDays[3] : "+monthDays[3]);
         
        // One step declaration : 
        
        int idNumber[] = new int[5];
        idNumber[0]=130;
        idNumber[1]=131;
        idNumber[2]=133;
        idNumber[3]=134;
        idNumber[4]=135;
        System.out.println("idNumber[0] : "+idNumber[0]);
        
        // Arrays can be initialized when they are declared :
        
        int MonthDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        System.out.println("MonthDays[3] : "+MonthDays[3]);
        System.out.println("MonthDays[4] : "+MonthDays[4]);
        
    }
    
}
