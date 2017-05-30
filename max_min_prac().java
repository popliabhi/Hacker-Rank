import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] array = new long[5];
        
        long max = 0, min= 0 , sum =0;
        array[0] = max = min = sum = in.nextLong(); //Read the first value outside the loop, to handle max, min calculation
        for (int i = 1; i < 5; i++) {
            array[i] = in.nextLong();
            if(array[i]>max) max = array[i];
            if(array[i]<min) min = array[i];
            sum += array[i];
        }
        System.out.println( (sum - max) + " " + (sum - min));
       
    }
}
