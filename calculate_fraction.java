import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[] array=new int[num];
        int p_count=0;
        int n_count=0;
        int z_count=0;
        for (int i=0;i<num;i++)
            {
            array[i]=in.nextInt();
           // System.out.println(array[i]);
            if (array[i]> 0)
                {
                p_count+=1;
            }
            else if (array[i]<0)
                {
                n_count+=1;
            }
            else
                z_count+=1;
        }
        
        
        double p_fraction=(double)p_count/num;
        double n_fraction=(double)n_count/num;
        double z_fraction=(double)z_count/num;
        
        String p_str = String.format("%.6f", p_fraction );
        String n_str = String.format("%.6f", n_fraction );
        String z_str = String.format("%.6f", z_fraction );
 
        System.out.println(p_str);
        System.out.println(n_str);
        System.out.println(z_str);
    }
}