import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void getRecord(int[] s, int n)
    {
        // Complete this function
      int  best_record=s[0];
      int  worst_record=s[0];
        int count_best=0;
        int count_worst =0;
        
        for(int i=1;i<n;i++)
            {
            if (worst_record>s[i] && s[i]!=s[i-1])
                {
                worst_record=s[i];
                count_worst+=1;
                
                }
            
             }
        for(int i=1;i<n;i++)
            {
            if (best_record<s[i] && s[i]!=s[i-1])
                {
                best_record=s[i];
                count_best+=1;
                }
            
             }
        
      System.out.println(count_best + " " + count_worst); 
      
        
    }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
       // int[] result = 
            getRecord(s,n);
      /*  String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");*/
    }
}
