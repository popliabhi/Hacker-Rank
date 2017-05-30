import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int num;
        num=in.nextInt();
        for(int i=0;i<num;i++)
            {
            for (int j=0;j<num;j++)
                {
                if(i + j >=num-1){
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}