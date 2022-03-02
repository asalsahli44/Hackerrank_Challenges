package HackerrankChalleges;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        String reverse = sb.toString();
        if(A.equals(reverse))
        {
            System.out.println("Yes");
        }
        else System.out.print("No");
    }

}
