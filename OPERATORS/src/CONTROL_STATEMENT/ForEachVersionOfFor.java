
package CONTROL_STATEMENT;

import java.util.Scanner;

public class ForEachVersionOfFor {
    
    public static void main(String[] args) {
        
        System.out.println("~~~The For Each loop is essentially read only.~~~");
        int []arr=new int[7];
        
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Enter the number of elements of the array : ");
        int n=obj.nextInt();
        
        System.out.print("Enter "+n+" integer numbers : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Arrays Elements : ");
        for(int x:arr)
        {
            System.out.print(x+" ");
            x=x*10;//No effecnt on arr.
        }
        System.out.println();
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    
}
