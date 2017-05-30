import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
            int apple_count=0;
        for (int i=0;i<m;i++)
            {
              if(apple[i]>0 && apple[i]>=(s-a) && apple[i]<=(t-a))
                  //System.out.println("Apples fall within the house parameters " +apple[i]);
                  apple_count+=1;
                  
            }
        
              int orange_count=0;
        for (int j=0; j<n;j++)
            {
               if(orange[j]<0 && orange[j]<=(t-b) && orange[j]>=(s-b))
                  //System.out.println("Oranges fall within the house parameters " +orange[j]);
                   orange_count+=1;
                   
            }
        
        System.out.println(apple_count);
        System.out.println(orange_count);
    }
}
