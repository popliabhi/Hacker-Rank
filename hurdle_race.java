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
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        int max=height[0];
        for (int i=0; i<n; i++)
            {
             if(max<height[i])
                 max=height[i];
            }
        
        int diff=max-k;
        if (diff>0)
            System.out.println(diff);
        else
            System.out.println("0");
    }
}
