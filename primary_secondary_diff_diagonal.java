import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num;
        int total_p = 0;
        int total_s = 0;
        num=in.nextInt();
       // System.out.println(num);
        int[][] matrix=new int[num][num];
        for (int i=0;i<num;i++)
            {
             for(int j=0;j<num;j++)
                 {
              matrix[i][j]=in.nextInt();
           //System.out.println(matrix[i][j]);
                 if (i==j)
                     {
                       total_p+=matrix[i][j];
                        }
                 
                 if (i==num-j-1)
                     {
                     total_s+=matrix[i][j];
                    }
                 
                }
        }
           // System.out.println("Primary diagonal Total "+ total_p);
            //System.out.println("Secondary diagonal Total "+ total_s);
        
        
        int abs_diff=Math.abs(total_p-total_s);
        System.out.println(abs_diff);
    }
}