import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String arr;
        arr=in.next();
        //System.out.println(arr);
        
        int a_length=arr.length();
        //System.out.println(a_length);
        int levels=0;
        int valleys=0;
        boolean belowSea=false;
        for (int i=0; i<a_length; i++)
            {
            char temp=arr.charAt(i);
            //System.out.println(temp);
            if(temp == 'U')
                levels++;
            else
                levels--;
            
            //remember
            if(!belowSea && levels < 0)
            {
                valleys++;
                belowSea = true;
            }
            
            if(levels >= 0)// above sea level
                belowSea = false;
        }
        System.out.println(valleys);
            }
        
            
    
}