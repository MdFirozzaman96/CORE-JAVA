
package COMMAND_LINE_ARGUMENTS;


public class CommandLineArgument {
    
    public static void main(String[] args) {// Command Line Argument is also means data given to the main method.
        
        for(int i=0;i<args.length;i++)
        {
            System.out.println("arges["+i+"] : "+args[i]);
        }
    }
    
}
