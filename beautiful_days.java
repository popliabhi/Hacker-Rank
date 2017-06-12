import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int k=in.nextInt();
        int count=0;
        for(int l=i; l<=j;l++) {
       if((l-reversal(l))%k ==0) 
           count+=1;
        }
        System.out.println(count);
        
    }
   public static int reversal(int number){
    int reverse = 0;
    int last_digit;
    while(number!=0){
        last_digit=number%10;
        reverse = 10*reverse +last_digit;
        number = number/10;
    }
   
    return reverse;
    }
}

