import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
     
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
       
        //int count_pair=0;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (c[i] > c[k]) 
                {
                    int temp;
                    temp = c[i];
                    c[i] = c[k];
                    c[k] = temp;
                }
            }
            
        }
      // for (int i=0; i<n; i++)
        //    System.out.println(c[i]);
       
        int temp=0;
        for (int i=0;i<n-1;i++){
            
            if(c[i]==c[i+1]){
                temp++;
                i++; // remember
                
            }
        }
           System.out.println(temp); 
    }
  
}
 
