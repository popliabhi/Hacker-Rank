import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       String inputtime=in.nextLine();
        String[] time_array=inputtime.split(":");
         String hh=time_array[0];
        String mm= time_array[1];
        String ss= time_array[2].substring(0,2);
       
        int updated_hours;
        
        if(time_array[2].substring(2,4).equalsIgnoreCase("PM")) 
            {
            if(Integer.parseInt(hh)<12)
                {
                updated_hours=Integer.parseInt(hh);
                updated_hours+=12;
                hh=Integer.toString(updated_hours);
                }
            }
        if (time_array[2].substring(2, 4).equalsIgnoreCase("AM")) {
      if (Integer.parseInt(hh) == 12) {
        hh = "00";
      }
    }
        System.out.println(hh+":"+mm+":"+ss);
        
    }
}