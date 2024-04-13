
package VARIABLE_LENGTH_ARGUMENTS;


/*public class VarargsAmbiguity {
    
    static void VarArgs(int ...v)
    {
        System.out.print("Contents : ");
        for(int x:v)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    static void VarArgs(String dpt,int batch,int ...id)
    {
        System.out.print(dpt+" "+batch+" : ");
        for(int x:id)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        VarArgs(130,131,133,134,135); //**Non static method can not be referenced from a static context.
    }
    
}*/

public class VarargsAmbiguity {
    
    static void VarArgs(int ...v)
    {
        System.out.print("Contents : ");
        for(int x:v)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    static void VarArgs(int batch,int ...id)
    {
        System.out.print(batch+" : ");
        for(int x:id)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        VarArgs(130); //**Non static method can not be referenced from a static context.
    }
    
}
