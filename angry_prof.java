import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int Test=input.nextInt();
        
        
        
       
        
        int[] count=new int[Test];
        
       for(int j=0; j<Test; j++)
           {
               //System.out.println("Test "+j);
                int N=input.nextInt();
                int k=input.nextInt();
                int[] time=new int[N];
                
                    for(int i=0; i<N; i++)
                        {
                            time[i]=input.nextInt();
                            //System.out.println(time[i]);
                            if(time[i]<=0)
                                {
                                  count[j]+=1;
                                }
                            
                        }
             //System.out.println("Count "+count[j]);
              if (count[j]<k)
                  System.out.println("YES");
              else
                  System.out.println("NO");
            }
        
                             
    }
}