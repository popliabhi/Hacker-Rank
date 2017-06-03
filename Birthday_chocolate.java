import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 static void solve(int n, int[] s, int d, int m)
{
    int count = 0;
    
    for (int i=0; i<n; i++)
    {
        int limit = i + m;
        if (limit > n)
        {
            break;
        }
        
        int sum = 0;
        for (int j=i; j<limit; j++)
        {
            sum += s[j];
        }
        
        if (sum == d)
        {
            ++count;
        }
        
    }
     System.out.println(count);
    
   
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        //int result = 
            solve(n, s, d, m);
        //System.out.println(result);
    }
}
