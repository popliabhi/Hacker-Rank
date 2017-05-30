import java.io.*;
import java.util.*;

public class Solution {

    static int addArray(int[] a, int num)
        {
        int sum=0;
        for (int i=0;i<num;i++)
            {
            sum=sum+a[i];
        }
        return (sum);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        num=in.nextInt();
        // System.out.println(num);
        int[] a=new int[num];
        for(int i=0; i<num;i++)
            {
            a[i] = in.nextInt();
           // System.out.println(a[i]);
        }
        int sum=addArray(a, num);
        System.out.println(sum);
        
    }
}