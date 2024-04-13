
package VARIABLE_LENGTH_ARGUMENTS;


public class PassArray {
    
    static void vlaTest(int v[])
    {
        System.out.println("Number of arguments : "+v.length);
        System.out.print("Contents : ");
        for(int x:v)
        {
            System.out.print(x+" ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        
        int a1[]={5,10,15,20};
        int a2[]={100,200};
        int a3[]={};
        vlaTest(a1);
        vlaTest(a2);
        vlaTest(a3);
    }
    
}
