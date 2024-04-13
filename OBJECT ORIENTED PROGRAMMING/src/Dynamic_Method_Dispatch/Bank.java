
package Dynamic_Method_Dispatch;


public class Bank {
    
    double getRateOfInterest()
    {
        return 0;
    }
    
}

class Trust extends Bank{
    
    double getRateOfInterest()
    {
        return 5.2;
    }
}

class Janota extends Bank{
    
    double getRateOfInterest()
    {
        return 9.3;
    }
}

class Grameen extends Bank{
    
    double getRateOfInterest()
    {
        return 15.7;
    }
}

class TestBank{
    
    public static void main(String[] args) {
        
        Bank r;
        r = new Trust();
        System.out.println("The rate of interst of Trust Bank : "+r.getRateOfInterest());
        
        r = new Janota();
        System.out.println("The rate of interest of Janota Bank : "+r.getRateOfInterest());
        
        r = new Grameen();
        System.out.println("The rate of interest of Grameen Bank : "+r.getRateOfInterest());
    }
}
