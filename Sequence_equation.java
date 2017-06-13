import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] p_inv=new int[n+1];
        
        for(int x=1; x<=n; x++)
            {
              int p=in.nextInt();
              p_inv[p]=x;
            }
         /* Calculate and print each y */
        for (int x = 1; x <= n; x++) {
            int y = p_inv[p_inv[x]];
            System.out.println(y);
        }
    }
}




        
       
