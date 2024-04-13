
package OOP_MISCELLANEOUS;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    
    public static void main(String[] args) {
        
        LocalDate dt = LocalDate.now();
        System.out.println("Todays Date Here : "+dt);
        
        LocalTime lt = LocalTime.now();
        System.out.println("Now It is : "+lt);
        
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("The Date and Time Here : "+ldt);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
        
        String SF = ldt.format(fmt);
        System.out.println("Date and Time after Formating : "+SF);
        
        DateTimeFormatter fmtt = DateTimeFormatter.ofPattern("dd/mm/yy hh:mm:ss ");
        String SFF = ldt.format(fmtt);
        System.out.println("Date and Time after Formating : "+SFF);
        
        DateTimeFormatter fmttt = DateTimeFormatter.ofPattern("E,MMM dd yyy");
        String SFFf = ldt.format(fmtt);
        System.out.println("Date and Time after Formating1 : "+SFFf);
    }
    
}
