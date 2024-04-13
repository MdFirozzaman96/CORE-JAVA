
package VARIABLE_LENGTH_ARGUMENTS;


/*public class Invalid_Vargargs {
    
    static void VaTest1(String str,int a,String msg,int n,int ...v)
    {
        System.out.println(str+" "+a+" : ");
        System.out.print("Contents : ");
        for(int x:v)
        {
            System.out.print(x+" ");
        }
        System.out.println("\n"+msg+n+"\n");
    }
    
    static void VaTest2(String dpt,String ...name)
    {
        System.out.println(dpt+" : ");
        System.out.print("Student Name : ");
        for(String StudentName:name)
        {
            System.out.print(StudentName+" ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        VaTest1("Varargs",1,"End of Vargargs",1,5,10,15,20);
        VaTest1("Varargs",2,"End of Vargargs",2,25,30,35,40);
        
        System.out.println();
        
        VaTest2("CSE","Md.Firozzaman,","Ratul Roy,","Md. Mazedul Islam");
        VaTest2("ME","Md.Munirul Islam,","Md.Atikul Islam,","Md. Shikhon");
        
        
    }
    
}*/


/// Invalid Varibale Length Arguments 

public class Invalid_Vargargs {
    
    static void VaTest1(String str,int a,int ...v,String msg,int n)
    {
        System.out.println(str+" "+a+" : ");
        System.out.print("Contents : ");
        for(int x:v)
        {
            System.out.print(x+" ");
        }
        System.out.println("\n"+msg+n+"\n");
    }
    
    static void VaTest2(String dpt1,String dtp2,String ...name1,String ...name2)
    {
        System.out.println(dpt+" : ");
        System.out.print("Student Name : ");
        for(String StudentName:name)
        {
            System.out.print(StudentName+" ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        VaTest1("Varargs",1,5,10,15,20,"End of Vargargs",1);
        
        System.out.println();
        
        VaTest2("CSE","ME","Md.Firozzaman,","Ratul Roy,","Md. Mazedul Islam","Md.Munirul Islam,","Md.Atikul Islam,","Md. Shikhon");
        
        
    }
    
}
