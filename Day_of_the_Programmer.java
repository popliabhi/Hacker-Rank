import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int year){
        // Complete this function
        int sum=0;
        int[] nyear={31,28,31,30,31,30,31,31};
        int[] lyear={31,29,31,30,31,30,31,31};
        int[] year_1918={31,15,31,30,31,30,31,31};
        
        if (year!=1918)
            {
        //Gregorian calendar
        if (year >1918 && (year%400==0 || (year%4==0 && year%100!=0)))
            {
            for(int i=0;i<8;i++)
                {
                  sum+=lyear[i];
                }
            // System.out.println("Gregorian: "+sum);
            }
        //Julian calendar
        else if (year < 1918 && year%4==0)
            {
               for(int i=0;i<8;i++)
                {
                  sum+=lyear[i];
                }
             // System.out.println("Julian: "+sum);
            }
        else
            {
                for(int i=0;i<8;i++)
                {
                  sum+=nyear[i];
                  
                }
         //  System.out.println("Normal: "+sum);
            }
       
        int diff=256-sum;
        String dd = Integer.toString(diff);
        String month="09";
        String syear=Integer.toString(year);
        
        System.out.println(dd+"."+month+"."+syear);
        }
        else
            {
            for(int i=0;i<8;i++)
                {
                  sum+=year_1918[i];
                }
             int diff_1918=256-sum;
           // System.out.println(diff_1918);
            String dd_1918 = Integer.toString(diff_1918);
            String month_1918="09";
            String syear_1918=Integer.toString(year);
        
        System.out.println(dd_1918+"."+month_1918+"."+syear_1918);   
            }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
       // String result = 
        solve(year);
        //System.out.println(result);
    }
}
