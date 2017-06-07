import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
           
             int diff_1=Math.abs(z-x);
             int diff_2=Math.abs(z-y);
             //System.out.println(diff_1);
             //System.out.println(diff_2);
            
            if (diff_1<diff_2)
            {
            System.out.println("Cat A");
            }
        else if (diff_1>diff_2)
            {
             System.out.println("Cat B");
            }
        else if (diff_1==diff_2)
            {
             System.out.println("Mouse C");
            }
        }
        
        
    }
}
