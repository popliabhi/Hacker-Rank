import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input= new Scanner(System.in);
        int T=input.nextInt();
        int[] utp=new int[T];
        int int_height=1;
        for(int i=0; i<T; i++)
            {
            utp[i]=input.nextInt();
            //System.out.println(utp[i]);
            
            }

          for(int i=0; i<T; i++)
              {
                 if (utp[i]==0)
                     {
                      System.out.println("1");
                    }
               else if(utp[i]!=0 && utp[i]%2!=0)
                    {
                        int height=0;
                for(int j=1; j<=utp[i];j=j+2)
                            {
                                height=height*2+2;
                            }
                    
                    System.out.println(height);
                    }
              
               else if(utp[i]!=0 && utp[i]%2==0)
                    {
                    int height_e=1;
                     for(int k=2;k<=utp[i];k=k+2)
                         {
                            height_e=height_e*2+1;
                          }
                   System.out.println(height_e);
                       }
              
          }
              
    }
}