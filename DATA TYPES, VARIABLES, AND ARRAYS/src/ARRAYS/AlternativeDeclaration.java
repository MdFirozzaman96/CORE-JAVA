
package ARRAYS;

import java.util.Scanner;

public class AlternativeDeclaration {
    
    public static void main(String[] args) {
        
        int[] num = new int [4];
        num[0]=2;
        num[1]=3;
        num[2]=5;
        num[3]=7;
        System.out.println("Elements of the array : ");
        for(int i=0;i<4;i++)
        {
            System.out.println("\t\t\tnum["+i+"] : "+num[i]);
        }
        System.out.println();
        
        int [] arr1,arr2,arr3;
        arr1=new int [3];
        arr2=new int [4];
        arr3=new int [5];
        
        Scanner obj = new Scanner(System.in);
        
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter "+(3+i)+" integer numbers to arr"+(i+1)+" : ");
            for(int j=0;j<(3+i);j++)
            {
                if(i==0)
                {
                    arr1[j]=obj.nextInt();
                }
                else if(i==1)
                {
                    arr2[j]=obj.nextInt();
                }
                else
                {
                    arr3[j]=obj.nextInt();
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            System.out.print("Elements of arr"+(i+1)+" : ");
            for(int j=0;j<(3+i);j++)
            {
                if(i==0)
                {
                    System.out.print(arr1[j]+" ");
                }
                else if(i==1)
                {
                    System.out.print(arr2[j]+" ");
                }
                else
                {
                    System.out.print(arr3[j]+" ");
                }
            }
            System.out.println();
        }
    }
    
}
