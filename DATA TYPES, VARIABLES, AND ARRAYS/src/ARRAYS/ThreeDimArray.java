
package ARRAYS;


public class ThreeDimArray {
    
    public static void main(String[] args) {
        
        int ThreeDim[][][] = new int[3][4][5];
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    ThreeDim[i][j][k]=i*j*k;
                    System.out.print(ThreeDim[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
    
}
