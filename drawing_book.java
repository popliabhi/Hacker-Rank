import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        int halfway = n / 2;
        int turns = 0;
        if (p > halfway) { 
            // turn from back
            int rev = n - p;
            if (rev > 1) {
                turns = rev/2;
            } else if (n % 2 == 0 && rev == 1){
                turns = 1;
            }
        } else {
            // turn from front
            if (p > 1) {
                turns = p/2;
            }
        }
        return turns;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
