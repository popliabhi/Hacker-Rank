import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int wlength = word.length();
       // for (int i=0; i<26;i++)
            //System.out.println(h[i]);
        int max = 0;

        for (int i = 0; i < wlength; i++)
        {
            char tempChar = word.charAt(i);  // remember
            if( max < h[tempChar - 97])
                max= h[tempChar - 97];
            else
                max=max;
            //System.out.println(tempChar-97);
            //System.out.println(h[tempChar-97]);
        }
        
        System.out.println(max * wlength);
    }
}
