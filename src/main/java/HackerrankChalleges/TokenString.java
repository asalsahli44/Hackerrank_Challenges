package HackerrankChalleges;

import java.util.Scanner;

public class TokenString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //System.out.println(s);
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        }
        else{
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for(String str : strings)
            {
                System.out.println(str);
            }
        }
        // Write your code here.
        scan.close();
    }
}
