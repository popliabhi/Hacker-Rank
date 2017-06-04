import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] bills= new int[n];
        
        for(int i=0;i<n;i++)
            {
              bills[i]=in.nextInt();
            }
        
        int bill_charged=in.nextInt();
        
        int sum=0;
        for (int j=0;j<n;j++)
            {
              sum+=bills[j];
            }
      int  actual_sum=sum-bills[k];
        //System.out.println(sum);
        
        int shared_bill=actual_sum/2;
        //System.out.println(shared_bill);
        
        if (shared_bill==bill_charged)
            {
             System.out.println("Bon Appetit");
            }
        else
            {
              int return_bill= bill_charged-shared_bill;
              System.out.println(return_bill);
            }
        
    }
}