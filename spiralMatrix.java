/**
 * Write a description of class spiralMatrix here.
 * sample output: 
 *enter n
5
1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9	
 *
 * @author (Priyadarshini-25)
 * @version (date=02-10-2020)
 */
import java.util.*;
public class spiralMatrix
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int c1=0,c2=n-1,r1=0,r2=n-1;
        int k=1;
        while(k<=(n*n))
        {
            for(int i=c1;i<=c2;i++)
            arr[r1][i]=k++;
            
            for(int j=r1+1;j<=r2;j++)
            arr[j][c2]=k++;
            
            for(int i=c2-1;i>=c1;i--)
            arr[r2][i]=k++;
            
            for(int j=r2-1;j>=r1+1;j--)
            arr[j][c1]=k++;
            
            r1++;
            r2--;
            c1++;
            c2--;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
