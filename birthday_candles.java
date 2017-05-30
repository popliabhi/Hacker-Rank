import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
        {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
       int max=height[0];
        int count=0;
        for(int i=1;i<n;i++)
            {
            if(max<=height[i])
                {
                  max=height[i];
                }
            }
        for(int i=0; i<n;i++)
            {
            if (height[i]==max)
                {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
