
package VARIABLE_LENGTH_ARGUMENTS;



public class VarArgs {
    
    static void PassArgs(int ...x)
    {
        System.out.print("Number of args : "+x.length+" Contensts : ");
        for(int n:x)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        PassArgs(10);
        PassArgs(5,7,11,13,17);
        PassArgs(130);
        PassArgs();
    }
    
}
