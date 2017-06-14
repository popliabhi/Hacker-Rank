import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        BigInteger fact= new BigInteger("1");
        
       while(n>1)
           {
             fact=fact.multiply(BigInteger.valueOf(n));
            
             n--;
            }
         System.out.println(fact);
    }
}
