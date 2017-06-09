import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[]s = new int[9];
    for(int s_i=0; s_i < 9; s_i++){
            s[s_i] = in.nextInt();
    }
       // for(int i=0; i<9; i++)
        //    System.out.println(s[i]);
    int sum=0;
    int possible[][]={{8,1,6,3,5,7,4,9,2},
                {8,3,4,1,5,9,6,7,2},
                {6,1,8,7,5,3,2,9,4},
                {6,7,2,1,5,9,8,3,4},
                {4,9,2,3,5,7,8,1,6},
                {4,3,8,9,5,1,2,7,6},
                {2,9,4,7,5,3,6,1,8},
                {2,7,6,9,5,1,4,3,8}};
    int ans=100;   
    for(int i=0;i<8;i++)
    {  
        sum=0;
        for(int j=0;j<9;j++)
            {
               if(s[j]!=possible[i][j])
                   {
                   sum+=Math.abs(s[j]-possible[i][j]);
               }
        }
        if(sum<ans)
            ans=sum;
    }    
   System.out.print(ans);
}
}