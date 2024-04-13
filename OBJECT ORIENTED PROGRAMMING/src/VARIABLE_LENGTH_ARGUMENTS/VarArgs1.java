

package VARIABLE_LENGTH_ARGUMENTS;



public class VarArgs1 {
    
    static void StandardArgs(String str,int ...v)
    {
        System.out.print(str+" Contents : ");
        for(int x:v)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        StandardArgs("Five vararg : ",2,3,5,7,11);
        StandardArgs("Three vararg : ",10,20,30);
        StandardArgs("No vararg : ");
    }
    
}
