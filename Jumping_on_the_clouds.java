import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        int E=100;
        int cloud=0;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        for(int i=0; i<n; i++)
            {
              if((i+k)%k==0)
                  {
           // System.out.println(cloud);
            cloud=(i+k)%n;
            
             if(c[i]==0)
                 E=E-1;
             else if (c[i]==1)
                 E=E-1-2;
              }
            }
        System.out.println(E);
        
    }
}
