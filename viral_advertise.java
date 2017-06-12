import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int like_people=5;
        int sum=0;
        
        
             for(int i=0;i<n;i++)
                 {
                 like_people=(int)Math.floor(like_people/2);
                 sum+=like_people;
                 like_people=like_people*3;
                
                 
            }
        System.out.println(sum);
       
    }
}

