import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
        int[] count_array=new int[5];
        for (int i=0; i<n;i++)
            {
                switch(types[i]) 
                {
                case 1: count_array[0]++; break;
                case 2: count_array[1]++; break;
                case 3: count_array[2]++; break;
                case 4: count_array[3]++; break;
                case 5: count_array[4]++; break;
                 }
            
            }
      /*  for(int i=0;i<5;i++)
            System.out.println(count_array[i]);*/
        int max=count_array[0];
        int index=0;
        for(int i=1;i<5;i++)
            {
              if(count_array[i]>max)
                  {
                    max=count_array[i];
                    index=i;
                  }
            }
          System.out.println(index+1);
    }
}

