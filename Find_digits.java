import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int num;
        int arr;
        
        int temp=0;
           
        for(int i=0; i<n ; i++)
            {
             int count=0;
             num=in.nextInt();
            arr=num;
               while(num>0)
                   {
                   temp=num%10;
                   //System.out.println(temp);
                   num=num/10;
                   if(temp>0 && arr%temp==0)
                    count+=1;
                   
                     }
            
              System.out.println(count);
        }
        
    }
}





