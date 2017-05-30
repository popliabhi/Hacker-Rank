import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[]grades, int n)
        {
        double[] temp_grades = new double[n];
      
        for (int i=0; i<n;i++)
            {
            temp_grades[i]=grades[i];
           // System.out.println("temp array " + temp_grades[i]);
        }
        for(int i=0;i<n; i++)
            {
               //System.out.println(temp_grades[i]/5);
              // System.out.println("round: "+Math.ceil(temp_grades[i]/5));
            // System.out.println("sum "+5*(Math.ceil(temp_grades[i]/5)));
            int diff=(int)((5*(Math.ceil(temp_grades[i]/5)))-temp_grades[i]) ;
           // System.out.println("diff "+diff);
            if (diff<3 && grades[i] >=38)
                {
                grades[i]=(int)temp_grades[i] + diff;
                System.out.println(grades[i]);
                }
                 
            
            else if (diff==3 && grades[i]>=38)
                {
                grades[i]=(int)temp_grades[i];
                System.out.println(grades[i]);
                }
            else
                {
                grades[i]=(int)temp_grades[i];
                System.out.println(grades[i]);
            }
             }     
            
    }
       public static void main(String[] args) 
       {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] grades = new int[n];
         for(int grades_i=0; grades_i < n; grades_i++){
             grades[grades_i] = in.nextInt();
        }
        
     
       solve(grades,n);
        //for (int i = 0; i < result.length; i++) {
          //  System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
       // }
        //System.out.println("");
        

    }
}
